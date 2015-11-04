package specification.steps.api;

import static jdo.application.ApplicationConfiguration.internalOrganizationPredicate;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

import java.util.UUID;

import javax.jms.IllegalStateException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import jdo.application.ApplicationConfiguration;
import jdo.crm.model.Aggregate;
import jdo.crm.model.CompanyCustomer;
import jdo.crm.model.OrganizationCustomer;
import jdo.crm.model.PersonCustomer;
import jdo.crm.util.CustomerConverter;
import jdo.dto.CompanyDto;
import jdo.dto.CompanyDto;
import jdo.dto.CustomerDto;
import jdo.dto.OrganizationDto;
import jdo.dto.PersonDto;
import jdo.party.model.Company;
import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.InternalOrganization;
import specification.steps.api.resources.CustomerDtoResourceClient;

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
	private final CustomerDtoResourceClient resource;

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

	/**
	 * Configuration for any JDO application.
	 */
	private ApplicationConfiguration applicationConfiguration;

	/**
	 * The owning company.
	 */
	private Company findCompany;

	/**
	 * Construct the object by creating the objectMapper, creating the client
	 * and configuring it and providing the resource.
	 *
	 * @param resourceToUse
	 *            for accessing the resource on the server.
	 */
	public CrmSteps(final CustomerDtoResourceClient resourceToUse) {
		super();
		resource = resourceToUse;
	}

	/**
	 * Close the entityManagerFactory and the entity Manager.
	 */
	@AfterStories
	public void closeEntityManager() {
		em.close();
		emf.close(); // close at application end
	}

	/**
	 * Create the entityManagerFactory, and the entity manager.
	 *
	 */
	@BeforeStories
	public void createEntityManager() {
		emf = Persistence.createEntityManagerFactory("crmBddTest");
		em = emf.createEntityManager();
		applicationConfiguration = new ApplicationConfiguration(em);
		findCompany = applicationConfiguration.company();
	}

	private String fqnType() {
		return "jdo.party.model." + type;
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
	 * Add the customer to the database.
	 */
	@Given("the customer is in the database")
	public void givenTheCustomerIsInTheDatabase() {
		// Use persistence.xml configuration
		Party customerAsParty = null;
		Aggregate customer = null;
		switch (type) {
		case "Person":
			final Person person = new Person();
			person.setFirstName(firstName);
			person.setLastName(lastName);
			customerAsParty = person;
			customer = new PersonCustomer(person);
			break;
		case "Organization":
			final Organization org = new Organization();
			org.setName(name);
			customerAsParty = org;
			customer = new OrganizationCustomer(org);
			break;
		case "Company":
			final Company company = new Company();
			company.setName(name);
			customerAsParty = company;
			customer = new CompanyCustomer(company);
			break;
		default:
			fail("Unknown type: " + type);
		}

		em.getTransaction().begin();
		em.persist(customerAsParty);
		customerDtoFromDb = CustomerConverter.convert(customer);
		final jdo.party.model.roles.Customer customerRole = new jdo.party.model.roles.Customer();
		customerAsParty.addPartyRole(customerRole);

		final InternalOrganization companyInternalRole = ( InternalOrganization ) applicationConfiguration.company()
				.getActingAs().stream().filter(internalOrganizationPredicate()).findFirst().get();

		final CustomerRelationship customerRelationship = new CustomerRelationship(companyInternalRole, customerRole);
		em.persist(customerRelationship);
		id = customerAsParty.getId();
		em.getTransaction().commit();

	}

	/**
	 *
	 * @param name
	 *            of the customer, comma delimited firstName, lastName if a
	 *            person.
	 */
	@Given("the name is <Name>")
	public final void setName(@Named("Name") final String name) {
		if (type.equals("Customer")) {
			final String[] split = name.split(",");
			firstName = split[0];
			lastName = split[1];
		} else {
			this.name = name;
		}
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
	 * Verify the response status is either OK, or No Content.
	 */
	@Then("I get a successful delete message")
	public void successfulDeleteMessage() {
		assertTrue((responseStatus == HttpStatus.SC_OK) || (responseStatus == HttpStatus.SC_NO_CONTENT));
	}

	/**
	 * Verify the name of the returned customer is correct.
	 */
	@Then("the name is correct")
	public void theNameIsCorrect() {
		if (customerDtoFromApi instanceof PersonDto) {
			assertEquals(firstName, (( PersonDto ) customerDtoFromApi).getFirstName());
			assertEquals(lastName, (( PersonDto ) customerDtoFromApi).getLastName());
		} else {
			assertEquals(name, (( OrganizationDto ) customerDtoFromApi).getName());
		}
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
	 * Verify that the response status is correct.
	 *
	 */
	@Then("I get an error message saying I can't change the type.")
	public void thenIGetAnErrorMessageSayingICantChangeTheType() {
		assertEquals(HttpStatus.SC_CONFLICT, responseStatus);
	}

	/**
	 * Verify the customer type is correct.
	 *
	 */
	@Then("the type is correct")
	public void thenISeeTheType() {
		assertEquals(fqnType(), customerDtoFromApi.getClass().getCanonicalName());
	}

	/**
	 * Assert the name has been changed.
	 */
	@Then("the customer has the <New Name>")
	public void thenTheCustomerHasTheNewName() {
		if (customerDtoFromApi instanceof PersonDto) {
			assertEquals(firstName, (( PersonDto ) customerDtoFromApi).getFirstName());
			assertEquals(lastName, (( PersonDto ) customerDtoFromApi).getLastName());
		} else {
			assertEquals(name, (( OrganizationDto ) customerDtoFromApi).getName());
		}
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
	 * Change the name.
	 *
	 * @param newName
	 *            The new name.
	 */
	@When("I change the name to <New Name>")
	public void whenIChangeTheNameToNewName(@Named("New Name") final String newName) {
		if (type.equals("Customer")) {
			final String[] split = newName.split(",");
			firstName = split[0];
			lastName = split[1];
		} else {
			name = newName;
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
	 * Delete the customer via the API.
	 */
	@When("I delete the customer")
	public void whenIDeleteTheCustomer() {
		final Response response = resource.delete(id);
		responseStatus = response.getStatus();
		customerDtoFromApi = null;
	}

	/**
	 * Save the customer by posting to the API.
	 *
	 * @throws IllegalStateException
	 *             If there is a type we haven't set up for.
	 */
	@When("I save the customer")
	public final void whenISaveTheCustomer() throws IllegalStateException {
		CustomerDto dto = null;
		if (fqnType().endsWith("Person")) {
			dto = new PersonDto(id, firstName, lastName);
		} else if (fqnType().endsWith("Organization")) {
			dto = new OrganizationDto(id, name);
		} else if (fqnType().endsWith("Company")) {
			dto = new CompanyDto(id, name);
		} else {
			throw new IllegalStateException(
					"FQN type " + fqnType() + " is not handled in the tests, CrmSteps.whenISaveTheCustomer");
		}
		Response response = null;
		if (id == null) {
			response = resource.post(dto);

		} else {
			response = resource.put(id, dto);
		}
		responseStatus = response.getStatus();
		customerDtoFromApi = response.readEntity(CustomerDto.class);
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
}
