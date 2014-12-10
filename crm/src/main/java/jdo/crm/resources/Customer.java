package jdo.crm.resources;

import static jdo.core.ApplicationConfiguration.internalOrganizationPredicate;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jdo.core.ApplicationConfiguration;
import jdo.dto.CustomerDto;
import jdo.errors.Errors;
import jdo.errors.ValidationError;
import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.InternalOrganization;

@Stateless
@Path("/customers")
public class Customer {

	@PersistenceContext(name = "all-models")
	private EntityManager	em;
	
	@EJB
	private ApplicationConfiguration config;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerDto create( CustomerDto customer) {
		
		Party entity = null;
		switch( customer.getPartyType()) {
			case "Person" :
				entity = new Person();
				((Person)entity).setFirstName(customer.getFirstName());
				((Person)entity).setLastName(customer.getLastName());
				break;
			case "Organization":
				entity = new Organization();
				((Organization)entity).setName(customer.getName());
				break;
			default:
				Errors error = new Errors();
				error.add("partyType", "Invalid type " + customer.getPartyType());
				throw new ValidationError( error);
		}
		
		jdo.party.model.roles.Customer customerRole = new jdo.party.model.roles.Customer();
		entity.addPartyRole( customerRole);
		
		em.persist(entity);
		
		InternalOrganization companyInternalRole = (InternalOrganization) config.getCompany().getActingAs().stream().filter( internalOrganizationPredicate()).findFirst().get();
		
		CustomerRelationship customerRelationship = new CustomerRelationship(companyInternalRole, customerRole);
		
		em.persist(customerRelationship);
		
		
		return customer;
	}

	@GET
	@Produces("application/json")
	public List<Party> listAll(@QueryParam("start") Integer startPosition, @QueryParam("max") Integer maxResult) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<CustomerRelationship> criteria = builder.createQuery(CustomerRelationship.class);
		Root<CustomerRelationship> entityRoot = criteria.from(CustomerRelationship.class);
		criteria.select(entityRoot);
		TypedQuery<CustomerRelationship> query = em.createQuery(criteria);
		if (startPosition != null) {
			query.setFirstResult(startPosition);
		}
		if (maxResult != null) {
			query.setMaxResults(maxResult);
		}
		List<CustomerRelationship> entities = query.getResultList();
		List<Party> customers = new ArrayList<Party>();
		entities.forEach(customerRelationship -> {
			Party party = customerRelationship.getRelationshipTo().getRoleFor();
			if (party instanceof Person) {
				customers.add((Person) party);
			} else {
				customers.add((Organization) party);
			}
		});
		return customers;
	}
}
