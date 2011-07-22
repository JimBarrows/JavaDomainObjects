package test.bdd.steps;

import org.jbehave.web.selenium.WebDriverProvider;

public class StepTemplate {

	private WebDriverProvider webDriverProvider;

	public StepTemplate(WebDriverProvider webDriverProvider) {
		super();
		this.webDriverProvider = webDriverProvider;
	}
	
	public WebDriverProvider getWebDriverProvider() {
		return webDriverProvider;
	}
	
	
}
