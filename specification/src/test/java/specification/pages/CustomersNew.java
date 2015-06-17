package specification.pages;

import static org.seleniumhq.selenium.fluent.Period.secs;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.TestableString;

public class CustomersNew extends CrmTemplate{

	public CustomersNew(WebDriverProvider driverProvider) {
		super(driverProvider, "/#/customers/new");		
	}	
	
	public TestableString pageHeader() {
		return within(secs(2)).div(By.className("page-header")).h2s().get(0)
				.getText();
	}

	public void setFirstName(String firstName) {
		input(By.name("firstName")).sendKeys(firstName);
		
	}

	public void selectCustomerType(String customerType) {
		select(By.name("type")).selectByVisibleText(customerType);
		
	}

	public void setLastName(String lastName) {
		input(By.name("lastName")).sendKeys(lastName);
		
	}

	public void clickSaveButton() {
		button(By.id("saveCustomer")).click();
		
	}

	public TestableString flashMessage() {
		return within(secs(2)).div(By.id("flash")).span().getText();
	}
	
}
