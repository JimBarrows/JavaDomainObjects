package jdo.party.controllers.party.person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.Person;

@ManagedBean(name = "PersonEdit")
@ViewScoped
public class Edit extends Template{		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String save() {		
		
		partyRepository.update(person);

		return "/index?faces-redirect=true&includeViewParams=true";
	}
		
	public void preRenderView() {
		if (person == null) {
			person = new Person();
		}
	}
	
}
