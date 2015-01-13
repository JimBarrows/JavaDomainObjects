package jdo.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Entity
public class OrderContactMechanism extends BasePersistentModel {

	private static final long			serialVersionUID	= 1L;
	@ManyToOne
	private ContactMechanism			contactMechanism;
	@ManyToOne
	private ContactMechanismPurposeType	usedFor;

	
	public ContactMechanism getContactMechanism() {
		return contactMechanism;
	}
	
	public ContactMechanismPurposeType getUsedFor() {
		return usedFor;
	}

	public void setContactMechanism(ContactMechanism contactMechanism) {
		this.contactMechanism = contactMechanism;
	}

	public void setUsedFor(ContactMechanismPurposeType usedFor) {
		this.usedFor = usedFor;
	}
}
