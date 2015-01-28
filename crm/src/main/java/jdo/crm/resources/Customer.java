package jdo.crm.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jdo.application.ApplicationConfiguration;
import jdo.dto.CustomerDto;
import jdo.dto.CustomerDtoList;
import jdo.ember.dto.Errors;
import jdo.ember.dto.ValidationError;
import jdo.party.model.Company;
import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.PartyRole;
import jdo.party.model.Person;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.InternalOrganization;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

//@Api(value = "/customers", description = "Operations about customers")
@RequestScoped
@Path("/customers")
public class Customer {

	@PersistenceContext(name = "all-models")
	private EntityManager em;

	@EJB
	private ApplicationConfiguration config;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
//	@ApiOperation(value = "Create Customer", notes = "Create a customer from the customer dto.", response = CustomerDto.class)
	@Transactional
	public CustomerDto create(CustomerDto customer) {

		Party entity = null;
		switch (customer.getPartyType()) {
		case "jdo.party.model.Company":
			entity = new Company();
			((Company) entity).setName(customer.getName());
			break;
		case "jdo.party.model.Organization":
			entity = new Organization();
			((Organization) entity).setName(customer.getName());
			break;
		case "jdo.party.model.Person":
			entity = new Person();
			((Person) entity).setFirstName(customer.getFirstName());
			((Person) entity).setLastName(customer.getLastName());
			break;

		default:
			Errors error = new Errors();
			error.put("partyType",
					Arrays.asList("Invalid type " + customer.getPartyType()));
			throw new ValidationError(error);
		}

		jdo.party.model.roles.Customer customerRole = new jdo.party.model.roles.Customer();
		entity.addPartyRole(customerRole);

		em.persist(entity);

		InternalOrganization companyInternalRole = (InternalOrganization) config
				.getCompany().getActingAs().stream()
				.filter(internalOrganizationPredicate()).findFirst().get();

		CustomerRelationship customerRelationship = new CustomerRelationship(
				companyInternalRole, customerRole);

		em.persist(customerRelationship);

		customer.setId(entity.getId());
		return customer;
	}

	private Predicate<? super PartyRole> internalOrganizationPredicate() {
		// TODO Auto-generated method stub
		return null;
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
//	@ApiOperation(value = "Update Customer", notes = "Updates a customer, using the id in the path, and customer data.", response = CustomerDto.class)
	@Transactional
	public CustomerDto update(@PathParam("id") Long id, CustomerDto customer) {
		if ((id == null) || (id < 0)) {
			throw new IllegalArgumentException(
					"Id must be part of path, and greater than 0.");
		}

		Party entity = em.find(Party.class, id);

		if (entity.getActingAs().stream().anyMatch(role -> {
			return (role instanceof jdo.party.model.roles.Customer);
		})) {

			switch (customer.getPartyType()) {
			case "jdo.party.model.Company":
				if (entity instanceof Company) {
					((Company) entity).setName(customer.getName());
				} else {
					throw new NotFoundException();
				}
				break;
			case "jdo.party.model.Organization":
				if (entity instanceof Company) {
					((Organization) entity).setName(customer.getName());
				} else {
					throw new NotFoundException();
				}
				break;
			case "jdo.party.model.Person":
				if (entity instanceof Person) {
					((Person) entity).setFirstName(customer.getFirstName());
					((Person) entity).setLastName(customer.getLastName());
				} else {
					throw new NotFoundException();
				}
				break;

			default:
				throw new NotFoundException();
			}
		} else {

			throw new NotFoundException();
		}
		return customer;
	}

//	@ApiOperation(value = "List all customers", notes = "Returns a list of all customers.  The parameters startPosition and maxResult do not need to be present, but control how much data is returned.", response = CustomerDto.class)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerDtoList listAll(@QueryParam("start") Integer startPosition,
			@QueryParam("max") Integer maxResult) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<CustomerRelationship> criteria = builder
				.createQuery(CustomerRelationship.class);
		Root<CustomerRelationship> entityRoot = criteria
				.from(CustomerRelationship.class);
		criteria.select(entityRoot);
		TypedQuery<CustomerRelationship> query = em.createQuery(criteria);
		if (startPosition != null) {
			query.setFirstResult(startPosition);
		}
		if (maxResult != null) {
			query.setMaxResults(maxResult);
		}
		List<CustomerRelationship> entities = query.getResultList();
		List<CustomerDto> customers = new ArrayList<CustomerDto>();
		entities.forEach(customerRelationship -> {
			Party party = customerRelationship.getRelationshipTo().getRoleFor();
			customers.add(new CustomerDto(party));
		});
		return new CustomerDtoList(customers);
	}

//	@ApiOperation(value = "Find a customer by the id.", notes = "Returns one customer, or NotFound.", response = CustomerDto.class)
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerDto findById(@PathParam("id") Long id) {
		Party party = em.find(Party.class, id);
		if (party == null) {
			throw new NotFoundException();
		}
		return new CustomerDto(party);
	}
}
