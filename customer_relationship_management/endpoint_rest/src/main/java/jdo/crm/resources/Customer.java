package jdo.crm.resources;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import jdo.application.ApplicationConfiguration;
import jdo.dto.CustomerDto;
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

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response.Status;
import java.util.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static jdo.party.FitlerUtils.isInternalOrganization;
import static jdo.party.specifications.HasActiveCustomerRelationshipWith.hasActiveCustomerRelationshipWith;

/**
 * Functionality behind the customers resource.
 *
 * @author Jim
 *
 */
@Api(value = "/customers", description = "Operations about customers")
@RequestScoped
@Path("/customers")
public class Customer {

	/**
	 * The repository keeping all the people & organizaiton information in it.
	 */
	@EJB
	private PartyRepository partyRepo;

	/**
	 * The repo for the relationships.
	 */
	@EJB
	private RelationshipRepository relationshipRepo;

	/**
	 * The configuration of the application.
	 *
	 */
	@EJB
	private ApplicationConfiguration configuration;

	/**
	 * Create a customer, this gets mapped to the post.
	 *
	 * @param customer
	 *            being created.
	 * @return the created customer.
	 */
	@POST
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	@ApiOperation(value = "Create Customer", notes = "Create a customer from the customer dto.", response = CustomerDto.class)
	public CustomerDto create(final CustomerDto customer) {

		Party party = null;

		if (customer.getPartyType().equals(Company.class.getCanonicalName())) {
			party = new Company();
			(( Company ) party).setName(customer.getName());

		} else if (customer.getPartyType().equals(Organization.class.getCanonicalName())) {
			party = new Organization();
			(( Organization ) party).setName(customer.getName());

		} else if (customer.getPartyType().equals(Person.class.getCanonicalName())) {
			party = new Person();
			(( Person ) party).setFirstName(customer.getFirstName());
			(( Person ) party).setLastName(customer.getLastName());
		} else {
			final Errors error = new Errors();
			error.put("partyType", Arrays.asList("Invalid type " + customer.getPartyType()));
			throw new ValidationError(error);
		}

		final jdo.party.model.roles.Customer customerRole = new jdo.party.model.roles.Customer();
		party.addPartyRole(customerRole);

		party = partyRepo.create(party);

		final InternalOrganization companyInternalRole = ( InternalOrganization ) configuration.company().getActingAs()
				.stream().filter(isInternalOrganization()).findFirst().get();

		CustomerRelationship customerRelationship = new CustomerRelationship(companyInternalRole, customerRole);

		customerRelationship = ( CustomerRelationship ) relationshipRepo.create(customerRelationship);

		return new CustomerDto(party);
	}

	/**
	 * Update a customer.
	 *
	 * @param id
	 *            of the customer.
	 * @param customer
	 *            The new customer information
	 * @return the updated customer
	 */
	@PUT
	@Path("/{id}")
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	@ApiOperation(value = "Update Customer", notes = "Updates a customer, using the id in the path, and customer data.", response = CustomerDto.class)
	@Transactional
	public CustomerDto update(@NotNull @PathParam("id") final UUID id, final CustomerDto customer) {

		final Party party = partyRepo.findById(id).orElseThrow(() -> new NotFoundException());

		if (!party.getClass().getCanonicalName().equals(customer.getPartyType())) {
			throw new ClientErrorException(Status.CONFLICT);
		}

		if (party.getActingAs().stream().anyMatch(role -> {
			return (role instanceof jdo.party.model.roles.Customer);
		})) {

			switch (customer.getPartyType()) {
			case "jdo.party.model.Company":
				if (party instanceof Company) {
					(( Company ) party).setName(customer.getName());
				} else {
					throw new NotFoundException();
				}
				break;
			case "jdo.party.model.Organization":
				if (party instanceof Organization) {
					(( Organization ) party).setName(customer.getName());
				} else {
					throw new NotFoundException();
				}
				break;
			case "jdo.party.model.Person":
				if (party instanceof Person) {
					(( Person ) party).setFirstName(customer.getFirstName());
					(( Person ) party).setLastName(customer.getLastName());
				} else {
					throw new NotFoundException();
				}
				break;

			default:
				System.out.println("##### Customer is not company, organization or person.");
				throw new NotFoundException();
			}
		} else {
			System.out.println("##### customer does not have a role of customer.");
			throw new NotFoundException();
		}
		return customer;
	}

	/**
	 * List all customers.
	 *
	 * @param offset
	 *            An optional offset into the returning array of customers.
	 * @param limit
	 *            The maximum number of customers to return.
	 * @return All the customers, if offset limit are provided then it's all the
	 *         customers starting at offset * limit to (offset * limit) + limit
	 */
	@ApiOperation(value = "List all customers", notes = "Returns a list of all customers.  "
			+ "The parameters offsetPosition and maxResult do not need to be present, but control how much data is returned.", response = CustomerDto.class)
	@GET
	@Path("/")
	@Produces(APPLICATION_JSON)
	public List<CustomerDto> listAll(@QueryParam("offset") final Integer offset,
			@QueryParam("APPLICATION_JSON") final Integer limit) {

		final List<CustomerDto> customerDtoList = new ArrayList<CustomerDto>();
		partyRepo.findBy(hasActiveCustomerRelationshipWith(configuration.company()), Optional.ofNullable(offset),
				Optional.ofNullable(limit)).forEach(party -> customerDtoList.add(new CustomerDto(party)));

		return customerDtoList;
	}

	/**
	 * Find a single customer by the customer id.
	 *
	 * @param id
	 *            of the customer.
	 * @return the customer or thrown a notfound exception.
	 */
	@ApiOperation(value = "Find a customer by the id.", notes = "Returns one customer, or NotFound.", response = CustomerDto.class)
	@GET
	@Path("/{id}")
	@Produces(APPLICATION_JSON)
	public CustomerDto findById(@PathParam("id") final UUID id) {
		return new CustomerDto(partyRepo.findById(id).orElseThrow(() -> new NotFoundException()));
	}
}
