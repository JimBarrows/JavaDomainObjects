package specification.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.TestableString;

import static org.seleniumhq.selenium.fluent.Period.secs;

/**
 * Represents that page at /#/customers/new.
 * 
 * @author Jim
 *
 */
public class CustomersNew extends CrmTemplate {

    /**Setup the page with the driver and the URL.
     * 
     * @param driverProvider the driver that actually works the page.
     */
    public CustomersNew(final WebDriverProvider driverProvider) {
	super(driverProvider, "/#/customers/new");
    }

    /**
     * 
     * @return The text in the page-header div.
     */
    public final TestableString pageHeader() {
	return within(secs(2)).div(By.className("page-header")).h2s().get(0).getText();
    }

    /**
     * 
     * @param firstName First name of the customer.
     */
    public final void setFirstName(final String firstName) {
	input(By.name("firstName")).sendKeys(firstName);

    }

    /**Select the customer type on the web page.
     * 
     * @param customerType One of the valid customer types (ie any that inherit from Party.)
     */
    public final void selectCustomerType(final String customerType) {
	select(By.name("type")).selectByVisibleText(customerType);

    }

    /**
     * Enter the last name on the page.
     * @param lastName of the person who is a customer.
     */
    public final void setLastName(final String lastName) {
	input(By.name("lastName")).sendKeys(lastName);

    }

    /**
     * Save the customer.
     */
    public final void clickSaveButton() {
	button(By.id("saveCustomer")).click();

    }
}
