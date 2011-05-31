package mbms.party.ui.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.Person;

public class PartyForm implements Serializable{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(PartyForm.class);
	
	private Party party = new Organization();

	public String addPerson() {
		if (logger.isDebugEnabled()) {
			logger.debug("addPerson() - start");
		}

		party = new Person();

		if (logger.isDebugEnabled()) {
			logger.debug("addPerson() - end - return value=form");
		}
		return "form";
	}
	
	public void addPostalAddress() {
		
	}
	
	public String addOrganization() {
		if (logger.isDebugEnabled()) {
			logger.debug("addOrganization() - start");
		}

		party = new Organization();

		if (logger.isDebugEnabled()) {
			logger.debug("addOrganization() - end - return value=form");
		}
		return "form";
	}
	
	public String done() {
		party = null;
		return "partyList";
	}

	public boolean isManaged() {
		if (logger.isDebugEnabled()) {
			logger.debug("isManaged() - start");
		}

		boolean returnboolean = ((party != null) && (party.getId() != null));
		if (logger.isDebugEnabled()) {
			logger.debug("isManaged() - end - return value=" + returnboolean);
		}
		return returnboolean;
	}

	public Party getParty() {
		return party;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
