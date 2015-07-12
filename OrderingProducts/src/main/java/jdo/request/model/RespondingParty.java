package jdo.request.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

@Entity
public class RespondingParty extends BasePersistentModel {

	private static final long serialVersionUID = 1L;
	/**
	 * UUID of the ContactMechanism.
	 * 
	 */
	private UUID contactMechanism;
	@Temporal(TemporalType.DATE)
	private Date dateSent;
	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID party;

	public UUID getContactMechanism() {
		return contactMechanism;
	}

	public Date getDateSent() {
		return dateSent;
	}

	public UUID getParty() {
		return party;
	}

	public void setContactMechanism(UUID contactMechanism) {
		this.contactMechanism = contactMechanism;
	}

	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}

	public void setParty(UUID party) {
		this.party = party;
	}
}
