package specification.steps.api;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;
import org.glassfish.jersey.filter.LoggingFilter;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import jdo.dto.CustomerDto;
import jdo.web.ObjectMapperProvider;

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
    private String type = "";
    /**
     * Name of the customer, if it isn't a person.
     */
    private String name = "";
    /**
     * The JSON client the steps use.
     */
    private final Client client;
    /**
     * The resource the client is accessing.
     */
    private WebTarget resource;
    /**
     * Response from the api.
     */
    private CustomerDto response;
    /**
     * Raw response from the api.
     */
    private Response jsonResponse;
    /**
     * First name of the person who is a customer.
     */
    private String firstName;
    /**
     * Last name of the person who is a customer.
     */
    private String lastName;

    /**
     * Construct the object by creating the objectMapper, creating the client
     * and configuring it and providing the resource.
     */
    public CrmSteps() {
	super();
	ObjectMapper objectMapper = new ObjectMapperProvider().getContext(null);

	client = ClientBuilder.newClient();
	client.register(new JacksonJaxbJsonProvider(objectMapper, null));
	client.register(new LoggingFilter(Logger.getGlobal(), true));
	resource = client.target("http://localhost:8090/crm/api").path("/customers");
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
	this.type = typeOfCustomer;
    }

    /**
     * Map this given statement to this function, and the function will then
     * execute the statement against the system under test.
     * 
     * @param nameOfCustomer
     *            IF it's a person, it should be the first and last name, seperated by a space.
     */
    @Given("I have provided the name <Name>")
    public final void givenIHaveProvidedTheName(@Named("Name") final String nameOfCustomer) {
	this.name = nameOfCustomer;
	if (name.split(" ").length == 2) {
	    this.firstName = name.split(" ")[0];
	    this.lastName = name.split(" ")[1];
	}
    }

    /**
     * Save the customer by posting to the API.
     */
    @When("I save the customer")
    public final void whenISaveTheCustomer() {
	CustomerDto dto = new CustomerDto(null, fqnType(), name, firstName, lastName);
	jsonResponse = resource.request().accept(APPLICATION_JSON).post(Entity.json(dto));
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
	assertEquals(HttpStatus.SC_OK, jsonResponse.getStatus());
	response = jsonResponse.readEntity(CustomerDto.class);
	assertNotNull("The response ccould not be converted into an entity.", response);
	if (response.getPartyType().equals("jdo.party.model.Person")) {
	    assertNull(response.getName());
	    assertEquals(firstName, response.getFirstName());
	    assertEquals(lastName, response.getLastName());
	} else {
	    assertEquals(this.name, response.getName());
	    assertNull(response.getFirstName());
	    assertNull(response.getLastName());
	}
	assertEquals(fqnType(), response.getPartyType());
    }

}
