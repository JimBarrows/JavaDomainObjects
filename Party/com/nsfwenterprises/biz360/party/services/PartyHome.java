package com.nsfwenterprises.biz360.party.services;

import java.util.Date;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.ecommerce.model.party.contactmechanism.EmailAddress;
import com.nsfwenterprises.biz360.ecommerce.model.party.contactmechanism.WebAddress;
import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.PartyClassification;
import com.nsfwenterprises.biz360.party.model.PartyContactMechanism;
import com.nsfwenterprises.biz360.party.model.PartyPostalAddress;
import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.Person;
import com.nsfwenterprises.biz360.party.model.contactmechanism.PostalAddress;
import com.nsfwenterprises.biz360.party.model.contactmechanism.TelecommunicationsNumber;

@SuppressWarnings("serial")
@Name("partyHome")
public class PartyHome extends EntityHome<Party> {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	protected Party createInstance() {
		if (Person.class.getSimpleName().equalsIgnoreCase(type)) {
			return new Person();
		} else if (Organization.class.getSimpleName().equalsIgnoreCase(type)) {
			return new Organization();
		} else {
			return null;
		}
	}

	@Factory
	public Party getParty() {
		return getInstance();
	}

	public void addPostalAddress() {
		PartyPostalAddress partyPostalAddress = new PartyPostalAddress();
		partyPostalAddress.setLocatedAt(new PostalAddress());
		partyPostalAddress.setFrom(new Date());
		getInstance().addAddress(partyPostalAddress);
	}

	public void addClassification() {
		PartyClassification partyClassification = new PartyClassification();
		partyClassification.setFrom(new Date());
		getInstance().addClassification(partyClassification);

	}

	public void addRole() {
		PartyRole partyRole = new PartyRole();
		partyRole.setFrom(new Date());
		getInstance().addPartyRole(partyRole);
	}

	public void addTelecommunicationMechanism() {
		TelecommunicationsNumber telecommunicationsNumber = new TelecommunicationsNumber();
		PartyContactMechanism partyContactMechanism = new PartyContactMechanism();
		partyContactMechanism.setSpecifiedVia(telecommunicationsNumber);
		partyContactMechanism.setFrom(new Date());
		getInstance().addPartyContactMechanism(partyContactMechanism);
	}

	public void addEmailAddress() {
		EmailAddress emailAddress = new EmailAddress();
		PartyContactMechanism partyContactMechanism = new PartyContactMechanism();
		partyContactMechanism.setFrom( new Date());
		partyContactMechanism.setSpecifiedVia(emailAddress);
		getInstance().addPartyContactMechanism(partyContactMechanism);
	}

	public void addWebAddress() {
		PartyContactMechanism partyContactMechanism = new PartyContactMechanism();
		WebAddress webAddress = new WebAddress();
		partyContactMechanism.setFrom( new Date());
		partyContactMechanism.setSpecifiedVia( webAddress);
		getInstance().addWebAddress( partyContactMechanism);
	}

	public void deleteContactMechanism(PartyContactMechanism contactMechanism) {
		contactMechanism.setThru( new Date());
	}

	public void deletePartyRole(PartyRole partyRole) {
		partyRole.setThru(new Date());
	}
}
