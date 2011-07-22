package test.bdd.steps;

import java.sql.SQLException;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.web.selenium.WebDriverProvider;
import org.springframework.beans.factory.annotation.Autowired;

import test.utils.DbUtils;

public class HousekeepingSteps extends StepTemplate {

	@Autowired
	DbUtils dbUtils;
	
	public HousekeepingSteps(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}

	@BeforeScenario
	public void beforeScenario() {
		try {
			dbUtils.cleanDb();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
