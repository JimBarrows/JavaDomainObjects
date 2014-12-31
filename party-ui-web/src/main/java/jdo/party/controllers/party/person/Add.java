package jdo.party.controllers.party.person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.Person;

@ManagedBean(name = "PersonAdd")
@ViewScoped
public class Add extends Template{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String save() {

		partyRepository.create(person);

		return "/index?faces-redirect=true&includeViewParams=true";
	}
	
	public Add() {
		super();
		person = new Person();
	}
	
}
