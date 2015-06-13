package specification.steps;

import jdo.party.model.Person;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import specification.pages.CrmIndex;
import specification.pages.CustomersNew;
import specification.pages.PageFactory;

public class CrmSteps {

	private CrmIndex index;
	private CustomersNew customerNew;

	private Person person;

	public CrmSteps(PageFactory pageFactory) {
		index = pageFactory.crmIndex();
		customerNew = pageFactory.customerNew();
	}

	@Given("I am on the crm site")
	public void givenIAmOnTheCrmSite() {
		index.go();
		index.onCorrectPage();
		index.url().baseShouldBe("http://localhost:8080/crm/");
		index.title().shouldBe("Customer Relationship Management");
		index.pageHeader().shouldBe("Customer Relationship Management");
	}

	@Given("I've chosen to add a person as a customer")
	public void addPersonAsCustomer() {
		index.clickAddButton();
		customerNew.onCorrectPage();
		customerNew.selectCustomerType("Person");
		person = new Person();
	}

	@Given("I enter the first name as $firstName")
	public void entgerFirstNameAs(String firstName) {
		customerNew.setFirstName(firstName);
		person.setFirstName(firstName);
	}

	@Given("I enter the last name as $lastName")
	public void enterLastNameAs(String lastName) {
		customerNew.setLastName(lastName);
		person.setLastName(lastName);
	}

	@When("I save the customer")	
	public void whenISaveTheCustomer() {
		customerNew.clickSaveButton();
	}

	@Then("I get a message indicating the successful save")
	@Pending
	public void thenIGetAMessageIndicatingTheSuccessfulSave() {
		// PENDING
	}

	@Then("I get shown the list of customers")
	@Pending
	public void thenIGetShownTheListOfCustomers() {
		// PENDING
	}

	@Then("the new customer in the list.")
	@Pending
	public void thenTheNewCustomerInTheList() {
		// PENDING
	}

}
