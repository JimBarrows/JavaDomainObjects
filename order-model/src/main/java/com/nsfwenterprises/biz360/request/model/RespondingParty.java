package com.nsfwenterprises.biz360.request.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;

@Entity
public class RespondingParty extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	private ContactMechanism contactMechanism;
	
	private Date dateSent;
	
	private Party party;
	
	@ManyToOne
	public ContactMechanism getContactMechanism() {
		return contactMechanism;
	}
	@Temporal(TemporalType.DATE)
	public Date getDateSent() {
		return dateSent;
	}
	
	@ManyToOne
	public Party getParty() {
		return party;
	}
	public void setContactMechanism(ContactMechanism contactMechanism) {
		this.contactMechanism = contactMechanism;
	}
	
	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}
	public void setParty(Party party) {
		this.party = party;
	}
}
