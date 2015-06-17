package specification.pages;

import static org.seleniumhq.selenium.fluent.Period.secs;

import java.util.List;
import java.util.stream.Collectors;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.TestableString;

public class CrmIndex extends CrmTemplate {

	public CrmIndex(WebDriverProvider driverProvider) {
		super(driverProvider,"/#/");
	}

	public TestableString title() {
		return within(secs(2)).title();
	}

	public TestableString pageHeader() {
		return within(secs(2)).div(By.className("page-header")).h1s().get(0)
				.getText();
	}

	public void clickAddButton() {
		link(By.linkText("Add")).click();
	}

	public List<TestableString> customerList() {
		return (List<TestableString>) ul(By.id("customerList")).lis().stream().map( li -> li.getText()).collect(Collectors.toList());
		
	}
}
