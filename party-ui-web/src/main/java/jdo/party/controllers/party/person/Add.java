package jdo.party.controllers.party.person;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.Person;

@ManagedBean(name = "PersonAdd")
@ViewScoped
public class Add extends Template{

	public String save() {

		partyCrud.create(person);

		return "/index?faces-redirect=true&includeViewParams=true";
	}
	
	@PostConstruct
	public void init() {
		person = new Person();
	}
	
}