package jdo.crm.resources;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static jdo.application.ApplicationConfiguration.internalOrganizationPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import jdo.application.ApplicationConfiguration;
import jdo.dto.CustomerDto;
import jdo.dto.CustomerDtoList;
import jdo.party.model.Company;
import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.InternalOrganization;
import jdo.party.repositories.PartyRepository;
import jdo.party.repositories.RelationshipRepository;
import jdo.web.Errors;
import jdo.web.ValidationError;

@Api(value = "/customers", description = "Operations about customers")
@RequestScoped
@Path("/customers")
public class Customer {

	@EJB
	private PartyRepository partyRepo;

	@EJB
	private RelationshipRepository relationshipRepo;

	@EJB
	private ApplicationConfiguration configuration;

	@POST
	@Consumes(APPLICATION_JSON)
	@ApiOperation(value = "Create Customer", notes = "Create a customer from the customer dto.", response = CustomerDto.class)	
	public CustomerDto create(CustomerDto customer) {

		Party party = null;

		if (customer.getPartyType().equals(Company.class.getCanonicalName())) {
			party = new Company();
			((Company) party).setName(customer.getName());

		} else if (customer.getPartyType().equals(Organization.class.getCanonicalName())) {
			party = new Organization();
			((Organization) party).setName(customer.getName());

		} else if (customer.getPartyType().equals(Person.class.getCanonicalName())) {
			party = new Person();
			((Person) party).setFirstName(customer.getFirstName());
			((Person) party).setLastName(customer.getLastName());
		} else {
			Errors error = new Errors();
			error.put("partyType", Arrays.asList("Invalid type " + customer.getPartyType()));
			throw new ValidationError(error);
		}

		jdo.party.model.roles.Customer customerRole = new jdo.party.model.roles.Customer();
		party.addPartyRole(customerRole);

		party = partyRepo.create(party);

		InternalOrganization companyInternalRole = (InternalOrganization) configuration.company().getActingAs()
				.stream().filter(internalOrganizationPredicate()).findFirst().get();

		CustomerRelationship customerRelationship = new CustomerRelationship(companyInternalRole, customerRole);

		customerRelationship = (CustomerRelationship) relationshipRepo.create(customerRelationship);
		
		return new CustomerDto(party);
	}

	@PUT
	@Path("/{id}")
	@Consumes(APPLICATION_JSON)
	@ApiOperation(value = "Update Customer", notes = "Updates a customer, using the id in the path, and customer data.", response = CustomerDto.class)
	@Transactional
	public CustomerDto update(@NotNull @PathParam("id") UUID id, CustomerDto customer) {

		Party party = partyRepo.findById(id).orElseThrow(() -> new NotFoundException());

		if (party.getActingAs().stream().anyMatch(role -> {
			return (role instanceof jdo.party.model.roles.Customer);
		})) {

			switch (customer.getPartyType()) {
			case "jdo.party.model.Company":
				if (party instanceof Company) {
					((Company) party).setName(customer.getName());
				} else {
					throw new NotFoundException();
				}
				break;
			case "jdo.party.model.Organization":
				if (party instanceof Company) {
					((Organization) party).setName(customer.getName());
				} else {
					throw new NotFoundException();
				}
				break;
			case "jdo.party.model.Person":
				if (party instanceof Person) {
					((Person) party).setFirstName(customer.getFirstName());
					((Person) party).setLastName(customer.getLastName());
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

	@ApiOperation(value = "List all customers", notes = "Returns a list of all customers.  The parameters startPosition and maxResult do not need to be present, but control how much data is returned.", response = CustomerDto.class)
	@GET
	@Produces(APPLICATION_JSON)
	public CustomerDtoList listAll(@QueryParam("start") Integer start, @QueryParam("max") Integer max) {

		Optional<Integer> startPosition = Optional.ofNullable(start);
		Optional<Integer> maxResult = Optional.ofNullable(max);

		List<CustomerDto> customerDtoList = new ArrayList<CustomerDto>();
		/**/
		configuration.company().getActingAs().stream()
			.filter( r -> {System.out.println("is role customer and active: " + r.getId());return (r instanceof jdo.party.model.roles.InternalOrganization) && r.getDateTimeRange().isActive();})
			.forEach(customerRole -> {
				System.out.println("Customer role: " + customerRole.getId());
				customerRole.getRelationshipsInvolvedIn().stream()
				.filter(relationship -> ((relationship instanceof CustomerRelationship) && relationship.getDateTimeRange().isActive()))
				.forEach(cr -> customerDtoList.add( new CustomerDto( ((CustomerRelationship)cr).getRelationshipTo().getRoleFor())));
			});
					


		return new CustomerDtoList(customerDtoList);
	}

	@ApiOperation(value = "Find a customer by the id.", notes = "Returns one customer, or NotFound.", response = CustomerDto.class)
	@GET
	@Path("/{id}")
	@Produces(APPLICATION_JSON)
	public CustomerDto findById(@PathParam("id") UUID id) {
		return new CustomerDto(partyRepo.findById(id).orElseThrow(() -> new NotFoundException()));
	}
}
