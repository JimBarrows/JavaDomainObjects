package test.bdd.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.jbehave.web.selenium.WebDriverProvider;

public class List extends PageTemplate {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(List.class);

	public List(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	
	public void go() {
		logger.debug("go() - start"); //$NON-NLS-1$

		get("http://localhost:8080");

		logger.debug("go() - end"); //$NON-NLS-1$
	}

}
