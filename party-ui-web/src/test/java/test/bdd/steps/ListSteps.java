package test.bdd.steps;

import mbmp.party.model.Organization;
import mbmp.party.model.Party;
import mbmp.party.model.Person;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.web.selenium.WebDriverProvider;

import test.utils.HibernateUtil;

public class ListSteps extends StepTemplate {

	public ListSteps(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);

	}
	
	@Given("there are $numberOfParties in the database")
	public void populateDatabase( int numberOfParties) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.beginTransaction();
		for( int i =0; i< numberOfParties; i++) {
			Party curParty=null;
			if( (i%2) == 0) {
				Person person = new Person();
				person.setFirstName("firstName " +i);
				person.setLastName("lastName" +i);
				curParty = person;
			} else {
				Organization organization = new Organization();
				organization.setName("name" +i);
				curParty = organization;
			}
			currentSession.save(curParty);
		}
		currentSession.getTransaction().commit();
	}
	
	@When("I am on the party list page")
	public void goToPartyListPage() {
		
	}

}
