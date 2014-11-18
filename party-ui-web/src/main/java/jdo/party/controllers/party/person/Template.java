package jdo.party.controllers.party.person;

import static org.apache.commons.lang.StringUtils.isNotBlank;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.AssertTrue;

import jdo.party.model.PartyRole;
import jdo.party.model.PartyRoleType;
import jdo.party.model.Person;
import jdo.party.services.PartyCrudServices;

public abstract class Template {

	@EJB
	protected PartyCrudServices	partyCrud;

	@PersistenceContext(name = "all-models")
	private EntityManager	em;
	
	protected Person				person;
	
	public abstract String save();
	
	public void addRole() {
		person = em.merge(person);
		PartyRole partyRole = new PartyRole();		
		person.addPartyRole(partyRole);
	}
	
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
