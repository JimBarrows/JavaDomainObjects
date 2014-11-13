package jdo.party.controllers.party.person;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.Person;
import jdo.party.services.PartyCrudServices;

@ManagedBean(name = "PersonEdit")
@ViewScoped
public class Edit {		

	Person person;

	@EJB
	private PartyCrudServices	partyCrud;

	public void preRenderView() {
		if (person == null) {
			person = new Person();
		}
	}
	public String save() {		
		
		partyCrud.update(person);

		return "/index?faces-redirect=true&includeViewParams=true";
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
