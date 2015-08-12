package specification.steps.ui;

import jdo.party.model.Person;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.seleniumhq.selenium.fluent.TestableString;

import specification.pages.CrmIndex;
import specification.pages.CustomersNew;
import specification.pages.PageFactory;

/**
 * Crm steps for the UI portion.
 * 
 * @author Jim
 *
 */
public class CrmSteps {

    /**
     * The index page.
     */
    private CrmIndex index;
    /**
     * The /customers/new page.
     */
    private CustomersNew customerNew;

    /**
     * The person who is a customer.
     */
    private Person person;

    /**
     * Construct the object by getting the pages that will be used in the steps.
     * 
     * @param pageFactory
     *            The factory for the page.
     */
    public CrmSteps(final PageFactory pageFactory) {
	index = pageFactory.crmIndex();
	customerNew = pageFactory.customerNew();
    }

    /**
     * Map the step to the function.
     */
    @Given("I am on the crm site")
    public final void givenIAmOnTheCrmSite() {
	index.go();
	index.onCorrectPage();
	index.title().shouldBe("Customer Relationship Management");
	index.pageHeader().shouldBe("Customer Relationship Management");
    }

    /**
     * Map the step to the function.
     */
    @Given("I've chosen to add a person as a customer")
    public final void addPersonAsCustomer() {
	index.clickAddButton();
	customerNew.onCorrectPage();
	customerNew.selectCustomerType("Person");
	person = new Person();
    }

    /**
     * Map the step to the function.
     * 
     * @param firstName
     *            of the customer
     */
    @Given("I enter the first name as $firstName")
    public final void enterFirstNameAs(final String firstName) {
	customerNew.setFirstName(firstName);
	person.setFirstName(firstName);
    }

    /**
     * Map the step to the function.
     * 
     * @param lastName
     *            of the customer
     */
    @Given("I enter the last name as $lastName")
    public final void enterLastNameAs(final String lastName) {
	customerNew.setLastName(lastName);
	person.setLastName(lastName);
    }

    /**
     * Map the step to the function.
     */
    @When("I save the customer")
    public final void whenISaveTheCustomer() {
	customerNew.clickSaveButton();
    }

    /**
     * Map the step.
     */
    @Then("I get a message indicating the successful save")
    public final void thenIGetAMessageIndicatingTheSuccessfulSave() {
	TestableString flashMessage = customerNew.flashMessage();
	flashMessage.shouldBe("New customer added.");
    }

    /**
     * Map the step.
     */
    @Then("I get shown the list of customers")
    public final void thenIGetShownTheListOfCustomers() {
	index.onCorrectPage();
    }

    /**
     * Map the step.
     */
    @Then("the new customer in the list.")
    public final void thenTheNewCustomerInTheList() {
	index.customerList().contains(person.getFirstName() + " " + person.getLastName());
    }

    /**
     * Map the step.
     */
    @Given("I've chosen to add a customer")
    @Pending
    public final void givenIHaveChosenToAddACustomer() {
	// PENDING
    }

    /**
     * Map the step.
     */
    @Given("I enter the organization name")
    @Pending
    public final void givenIEnterTheOrganizationName() {
	// PENDING
    }

    /**
     * Map the step.
     */
    @Then("I get shown the list of customers with the new customer in the list.")
    @Pending
    public final void thenIGetShownTheListOfCustomersWithTheNewCustomerInTheList() {
	// PENDING
    }

}
