package specification.steps.api;

import jdo.application.ApplicationConfiguration;
import jdo.crm.models.Customer;
import jdo.dto.CustomerDto;
import jdo.party.model.Company;
import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.InternalOrganization;
import org.apache.http.HttpStatus;
import org.jbehave.core.annotations.*;
import specification.steps.api.resources.CustomerDtoResource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.core.Response;
import java.util.UUID;

import static jdo.party.FilterUtils.isInternalOrganization;
import static junit.framework.Assert.*;

/**
 * The steps for the crm functionality in the API.
 *
 * @author Jim
 *
 */
public class CrmSteps {

	/**
	 * The type of the customer.
	 *
	 */
	private String	type	= "";
	/**
	 * Name of the customer, if it isn't a person.
	 */
	private String	name	= "";

	/**
	 * First name of the person who is a customer.
	 */
	private String	firstName;
	/**
	 * Last name of the person who is a customer.
	 */
	private String	lastName;

	/**
	 * The api resource.
	 *
	 */
	private final CustomerDtoResource resource;

	/**
	 * ID of the customer.
	 */
	private UUID					id;
	/**
	 * This is where we put the customer dto when we get it from the api.
	 */
	private CustomerDto				customerDtoFromApi;
	/**
	 * What the status of the response was when we accessed the api.
	 */
	private int						responseStatus;
	/**
	 * The customer dto we retrieve, or are going to put into the db.
	 */
	private CustomerDto				customerDtoFromDb;
	/**
	 * The JPA entity manager.
	 */
	private EntityManager			em;
	/**
	 * The JPA entity manager factory.
	 */
	private EntityManagerFactory	emf;

	private ApplicationConfiguration	applicationConfiguration;
	private Company						findCompany;

	/**
	 * Construct the object by creating the objectMapper, creating the client
	 * and configuring it and providing the resource.
	 *
	 * @param resourceToUse
	 *            for accessing the resource on the server.
	 */
	public CrmSteps(final CustomerDtoResource resourceToUse) {
		super();
		resource = resourceToUse;
	}

	/**
	 * Map this given statement to this function, and the function will then
	 * execute the statement against the system under test.
	 *
	 * @param typeOfCustomer
	 *            of customer.
	 */
	@Given("I have chose to add a <Type>")
	public final void givenIHaveChoseToAddAType(@Named("Type") final String typeOfCustomer) {
		type = typeOfCustomer;
	}

	/**
	 * Map this given statement to this function, and the function will then
	 * execute the statement against the system under test.
	 *
	 * @param nameOfCustomer
	 *            IF it's a person, it should be the first and last name,
	 *            separated by a space.
	 */
	@Given("I have provided the name <Name>")
	public final void givenIHaveProvidedTheName(@Named("Name") final String nameOfCustomer) {
		name = nameOfCustomer;
		if (name.split(" ").length == 2) {
			firstName = name.split(" ")[0];
			lastName = name.split(" ")[1];
		}
	}

	/**
	 * Save the customer by posting to the API.
	 */
	@When("I save the customer")
	public final void whenISaveTheCustomer() {
		final CustomerDto dto = new CustomerDto(id, fqnType(), name, firstName, lastName);
		Response response = null;
		if (id == null) {
			response = resource.post(dto);

		} else {
			response = resource.put(id, dto);
		}
		responseStatus = response.getStatus();
		customerDtoFromApi = response.readEntity(CustomerDto.class);
	}

	private String fqnType() {
		return "jdo.party.model." + type;
	}

	/**
	 * Map this then statement to this function, and the function will then
	 * execute the statement against the system under test.
	 */
	@Then("I get a message indicating a successful save")
	public final void thenIGetAMessageIndicatingASuccessfulSave() {
		assertEquals(HttpStatus.SC_OK, responseStatus);
	}

	/**
	 *
	 * @param type
	 *            of the customer.
	 */
	@Given("a <Type> customer")
	public final void setType(@Named("Type") final String type) {
		this.type = type;
	}

	/**
	 *
	 * @param name
	 *            of the customer, comma delimited firstName, lastName if a
	 *            person.
	 */
	@Given("the name is <Name>")
	public final void setName(@Named("Name") final String name) {
		if (type.equals("CustomerResource")) {
			final String[] split = name.split(",");
			firstName = split[0];
			lastName = split[1];
		} else {
			this.name = name;
		}
	}

	/**
	 * View the customer by id, which should be set in a given.
	 *
	 */
	@When("I view the customer")
	public void whenIViewTheCustomer() {
		final Response response = resource.getById(id);
		responseStatus = response.getStatus();
		if (responseStatus == HttpStatus.SC_OK) {
			customerDtoFromApi = response.readEntity(CustomerDto.class);
		}
	}

	/**
	 * Verify the customer type is correct.
	 *
	 */
	@Then("the type is correct")
	public void thenISeeTheType() {
		assertEquals(fqnType(), customerDtoFromApi.getPartyType());
	}

	/**
	 * Verify the name of the returned customer is correct.
	 */
	@Then("the name is correct")
	public void theNameIsCorrect() {
		if (customerDtoFromApi.getPartyType().equals("jdo.party.model.Person")) {
			assertEquals(firstName, customerDtoFromApi.getFirstName());
			assertEquals(lastName, customerDtoFromApi.getLastName());
		} else {
			assertEquals(name, customerDtoFromApi.getName());
		}
	}

	/**
	 * Add the customer to the database.
	 */
	@Given("the customer is in the database")
	public void givenTheCustomerIsInTheDatabase() {
		// Use persistence.xml configuration
		Party customerAsParty = null;
		switch (type) {
		case "Person":
			final Person person = new Person();
			person.setFirstName(firstName);
			person.setLastName(lastName);
			customerAsParty = person;
			break;
		case "Organization":
			final Organization org = new Organization();
			org.setName(name);
			customerAsParty = org;
			break;
		case "Company":
			final Company company = new Company();
			company.setName(name);
			customerAsParty = company;
			break;
		default:
			fail("Unknown type: " + type);
		}

		em.getTransaction().begin();
		em.persist(customerAsParty);
		customerDtoFromDb = new CustomerDto(new Customer(customerAsParty));
		final jdo.party.model.roles.Customer customerRole = new jdo.party.model.roles.Customer();
		customerAsParty.addPartyRole(customerRole);

		final InternalOrganization companyInternalRole = ( InternalOrganization ) applicationConfiguration.company()
				.getActingAs().stream().filter(isInternalOrganization()).findFirst().get();

		final CustomerRelationship customerRelationship = new CustomerRelationship(companyInternalRole, customerRole);
		em.persist(customerRelationship);
		id = customerAsParty.getId();
		em.getTransaction().commit();

	}

	/**
	 * Change the name.
	 *
	 * @param newName
	 *            The new name.
	 */
	@When("I change the name to <New Name>")
	public void whenIChangeTheNameToNewName(@Named("New Name") final String newName) {
		if (type.equals("CustomerResource")) {
			final String[] split = newName.split(",");
			firstName = split[0];
			lastName = split[1];
		} else {
			name = newName;
		}
	}

	/**
	 * Assert the name has been changed.
	 */
	@Then("the customer has the <New Name>")
	public void thenTheCustomerHasTheNewName() {
		if (customerDtoFromApi.getPartyType().equals("jdo.party.model.Person")) {
			assertEquals(firstName, customerDtoFromApi.getFirstName());
			assertEquals(lastName, customerDtoFromApi.getLastName());
		} else {
			assertEquals(name, customerDtoFromApi.getName());
		}
	}

	/**
	 * Change the type.
	 *
	 * @param newType
	 *            The type too change to.
	 */
	@When("I change the type to <New Type>")
	public void whenIChangeTheTypeToNewType(@Named("New Type") final String newType) {
		type = newType;
	}

	/**
	 * Verify that the response status is correct.
	 *
	 */
	@Then("I get an error message saying I can't change the type.")
	public void thenIGetAnErrorMessageSayingICantChangeTheType() {
		assertEquals(HttpStatus.SC_CONFLICT, responseStatus);
	}

	/**
	 * Delete the customer via the API.
	 */
	@When("I delete the customer")
	public void whenIDeleteTheCustomer() {
		final Response response = resource.delete(id);
		responseStatus = response.getStatus();
		customerDtoFromApi = null;
	}

	/**
	 * Verify the response status is either OK, or No Content.
	 */
	@Then("I get a successful delete message")
	public void successfulDeleteMessage() {
		assertTrue((responseStatus == HttpStatus.SC_OK) || (responseStatus == HttpStatus.SC_NO_CONTENT));
	}

	/**
	 * Verify the customer is not in the DB.
	 *
	 */
	@Then("the customer is not in the database")
	public void thenTheCustomerIsNotInTheDatabase() {
		final Party party = em.find(Party.class, id);
		assertNull(party);
	}

	/**
	 * The API returns the appropriate error.
	 */
	@Then("when I get the customer, I get an error")
	public void thenWhenIGetTheCustomerIGetAnError() {
		final Response response = resource.getById(id);
		assertEquals(HttpStatus.SC_NOT_FOUND, response.getStatus());
	}

	/**
	 * Create the entityManagerFactory, and the entity manager.
	 *
	 */
	@BeforeStories
	public void createEntityManager() {
//		emf = Persistence.createEntityManagerFactory("crmBddTest");
//		em = emf.createEntityManager();
//		applicationConfiguration = new ApplicationConfiguration(em);
		findCompany = applicationConfiguration.company();
	}

	/**
	 * Close the entityManagerFactory and the entity Manager.
	 */
	@AfterStories
	public void closeEntityManager() {
		em.close();
		emf.close(); // close at application end
	}
}
