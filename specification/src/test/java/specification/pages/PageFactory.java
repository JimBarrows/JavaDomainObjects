package specification.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class PageFactory {
	private final WebDriverProvider webDriverProvider;

	public PageFactory(WebDriverProvider webDriverProvider) {
		super();
		this.webDriverProvider = webDriverProvider;
	}
	
	public CrmIndex crmIndex() {
		return new CrmIndex( webDriverProvider);
	}

	public CustomersNew customerNew() {
		return new CustomersNew(webDriverProvider);
		
	}
}
