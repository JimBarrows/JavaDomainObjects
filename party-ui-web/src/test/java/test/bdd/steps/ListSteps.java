package test.bdd.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mbmp.party.model.Organization;
import mbmp.party.model.Party;
import mbmp.party.model.Person;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.web.selenium.WebDriverProvider;

import test.bdd.pages.List;
import test.utils.HibernateUtil;

public class ListSteps extends StepTemplate {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ListSteps.class);

	List listPage;

	public ListSteps(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
		listPage = new List(webDriverProvider);

	}

	@Given("there are $numberOfParties in the database")
	public void thereAreNumberOfPartiesInTheDatabase(int numberOfParties) {
		logger.debug("populateDatabase(int numberOfParties=" + numberOfParties + ") - start"); //$NON-NLS-1$ //$NON-NLS-2$

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.beginTransaction();
		for (int i = 0; i < numberOfParties; i++) {
			Party curParty = null;
			if ((i % 2) == 0) {
				Person person = new Person();
				person.setFirstName("firstName " + i);
				person.setLastName("lastName" + i);
				curParty = person;
			} else {
				Organization organization = new Organization();
				organization.setName("name" + i);
				curParty = organization;
			}
			currentSession.save(curParty);
		}
		currentSession.getTransaction().commit();

		logger.debug("populateDatabase(int numberOfParties) - end"); //$NON-NLS-1$
	}

	@When("I am on the party list page")
	public void iAmOnthePartyListPage() {
		listPage.go();
	}

	@Then("I only see $numberOfParties parties")
	public void iOnlySeeNumberOfParties(int numberOfParties) {

	}

}
