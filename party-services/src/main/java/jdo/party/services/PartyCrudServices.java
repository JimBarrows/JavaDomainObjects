package jdo.party.services;

import javax.ejb.Remote;
import javax.validation.ValidationException;

import jdo.party.model.Party;

@Remote
public interface PartyCrudServices {

	public Party create( Party party) throws ValidationException;
	
	public Party read( Long id);
	
	public Party update( Party party) throws ValidationException;
	
	public void delete(Party party);
}
