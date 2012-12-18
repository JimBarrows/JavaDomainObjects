package mbms.party;

import static org.apache.commons.lang.StringUtils.isBlank;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import mbmp.party.model.Person;
import mbms.party.services.PartyCrudServices;

public class PersonController {

	private String firstName;
	private String lastName;
	private String middleName;

	@EJB
	private PartyCrudServices partyCrud;
	
	public String save() {
		String outcome = "saved";
		if (isBlank(firstName) && isBlank(lastName)) {
			FacesMessage message = new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"At least a first or last name must be provided.",
					"Either a first name or a last name should be provided.");
			FacesContext.getCurrentInstance().addMessage(
					"addPersonForm:firstName", message);
			FacesContext.getCurrentInstance().addMessage(
					"addPersonForm:lastName", message);
			outcome = "notsaved";
		}else {
			Person party = new Person();
			party.setFirstName(firstName);
			party.setMiddleName(middleName);
			party.setLastName(lastName);
			partyCrud.create(party );
			outcome = "saved";
		}
		
		return outcome;
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
