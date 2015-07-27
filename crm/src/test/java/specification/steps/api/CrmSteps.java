package specification.steps.api;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static junit.framework.Assert.*;
import static org.apache.commons.lang3.StringUtils.*;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import jdo.dto.CustomerDto;
import jdo.web.ObjectMapperProvider;

public class CrmSteps {

	private String type = "";
	private String name = "";
	private final Client client;
	private WebTarget resource;
	private CustomerDto response;
	private Response jsonResponse;
	private String firstName;
	private String lastName;

	public CrmSteps() {
		super();
		ObjectMapper objectMapper = new ObjectMapperProvider().getContext(null);

		client = ClientBuilder.newClient();
		client.register(new JacksonJaxbJsonProvider(objectMapper, null));
		client.register(new LoggingFilter(Logger.getGlobal(), true));
		resource = client.target("http://localhost:8090/crm/api").path("/customers");
	}

	@Given("I have chose to add a <Type>")
	public void givenIHaveChoseToAddAType(@Named("Type") String type) {
		this.type = type;
	}

	@Given("I have provided the name <Name>")
	public void givenIHaveProvidedTheName(@Named("Name") String name) {
		this.name = name;
		if (name.split(" ").length == 2) {
			this.firstName = name.split(" ")[0];
			this.lastName = name.split(" ")[1];
		}
	}

	@When("I save the customer")
	public void whenISaveTheCustomer() {
		CustomerDto dto = new CustomerDto(null, fqnType(), name, firstName, lastName);
		jsonResponse = resource.request().accept(APPLICATION_JSON).post(Entity.json(dto));
	}

	private String fqnType() {
		return "jdo.party.model." + type;
	}

	@Then("I get a message indicating a successful save")
	public void thenIGetAMessageIndicatingASuccessfulSave() {
		assertEquals(200, jsonResponse.getStatus());
		response = jsonResponse.readEntity(CustomerDto.class);
		assertNotNull("The response ccould not be converted into an entity.", response);
		if (response.getPartyType().equals("jdo.party.model.Person")) {
			assertNull( response.getName());
			assertEquals(firstName, response.getFirstName());
			assertEquals(lastName, response.getLastName());
		} else {
			assertEquals(this.name, response.getName());
			assertNull( response.getFirstName());
			assertNull( response.getLastName());
		}
		assertEquals(fqnType(), response.getPartyType());
	}

	@Then("I get shown the list of customers")
	public void thenIGetShownTheListOfCustomers() {
		// Not applicable to a json response.
	}

	@Then("the new customer is in the list.")
	public void thenTheNewCustomerIsInTheList() {
		// Not applicable to a json response.
	}
}
