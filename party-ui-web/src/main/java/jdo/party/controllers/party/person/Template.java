package jdo.party.controllers.party.person;

import static org.apache.commons.lang.StringUtils.isNotBlank;

import javax.ejb.EJB;
import javax.validation.constraints.AssertTrue;

import jdo.party.model.Person;
import jdo.party.services.PartyCrudServices;

public abstract class Template {

	@EJB
	protected PartyCrudServices	partyCrud;

	protected Person				person;
	
	public abstract String save();
	
	@AssertTrue(message = "Either first or last name must have a value.")
	public boolean isEitherFirstNameOrLastNameNotNull() {
		return isNotBlank(person.getFirstName()) || isNotBlank(person.getLastName());
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
