package specification.pages;

import static org.seleniumhq.selenium.fluent.Period.secs;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

public class CrmTemplate extends FluentWebDriverPage {

	private String baseUrl;
	private String pageUrl;

	public CrmTemplate(WebDriverProvider driverProvider, String pageUrl) {
		super(driverProvider);
		this.pageUrl = pageUrl;

		baseUrl = "http://localhost:8080/crm";

	}

	public void go() {
		get(expectedUrl());
	}
	
	protected String expectedUrl() {
		return baseUrl + pageUrl;
	}

	public void onCorrectPage() {
		within(secs(2)).url().shouldBe(expectedUrl());
	}
}
