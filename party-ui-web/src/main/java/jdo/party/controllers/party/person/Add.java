package jdo.party.controllers.party.person;

import static org.apache.commons.lang.StringUtils.isNotBlank;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.AssertTrue;

import jdo.party.model.Person;
import jdo.party.services.PartyCrudServices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ManagedBean(name="PersonAdd")
@RequestScoped
public class Add {
	/**
	 * Logger for this class
	 */
	private static final Logger	logger	= LogManager.getLogger(Add.class.getName());

	private String				firstName;
	private String				lastName;
	private String				middleName;

	@EJB
	private PartyCrudServices	partyCrud;

	public String save() {
		logger.debug("save() - start");

		String outcome = "saved";

		Person party = new Person();
		party.setFirstName(firstName);
		party.setMiddleName(middleName);
		party.setLastName(lastName);
		partyCrud.create(party);

		logger.debug("save() - end - return value={}", outcome);
		return "/index?faces-redirect=true&includeViewParams=true";
	}
	
	@AssertTrue(message="Either first or last name must have a value.")
	public boolean isEitherFirstNameOrLastNameNotNull() {
		return isNotBlank(firstName ) || isNotBlank(lastName);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
