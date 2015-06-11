package specification.pages;

import static org.seleniumhq.selenium.fluent.Period.secs;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.seleniumhq.selenium.fluent.TestableString;
public class CrmHome extends FluentWebDriverPage{

	public CrmHome(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public TestableString title() {
		return within(secs(2)).header().title();
	}
}
