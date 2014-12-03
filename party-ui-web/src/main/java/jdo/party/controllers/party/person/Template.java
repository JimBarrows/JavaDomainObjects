package jdo.party.controllers.party.person;

import static org.apache.commons.lang.StringUtils.isNotBlank;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.validation.constraints.AssertTrue;

import jdo.party.model.PartyRole;
import jdo.party.model.Person;
import jdo.party.repositories.PartyRepository;

public abstract class Template implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@EJB
	protected PartyRepository	partyRepository;

	protected Person			person;

	public abstract String save();

	public String addRole() {
		return String.format("/party/role/add?faces-redirect=true&party=%d",person.getId());
	}
	
	public String editRole(PartyRole role) {
		return String.format("/party/role/edit?faces-redirect=true&party=%d&partyRole",person.getId(), role.getId());
	}

	@AssertTrue(message = "Either first or last name must have a value.")
	public boolean isEitherFirstNameOrLastNameNotNull() {
		return isNotBlank(person.getFirstName()) || isNotBlank(person.getLastName());
	}

	public Person getPerson() {
		if (person != null && person.getId() != null) {
			person = (Person) partyRepository.findById(person.getId());
		}
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
