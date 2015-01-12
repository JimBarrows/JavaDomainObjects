package jdo.request.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.ContactMechanism;

@Entity
public class RespondingParty extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;
	@ManyToOne
	private ContactMechanism	contactMechanism;
	@Temporal(TemporalType.DATE)
	private Date				dateSent;
	@ManyToOne
	private Party				party;

	
	public ContactMechanism getContactMechanism() {
		return contactMechanism;
	}

	
	public Date getDateSent() {
		return dateSent;
	}

	
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
