package jdo.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Entity
public class OrderItemContactMechanism extends BasePersistentModel {

	private static final long			serialVersionUID	= 1L;

	@NotNull
	@ManyToOne
	private ContactMechanism			mechanism;

	@NotNull
	@ManyToOne
	private ContactMechanismPurposeType	type;

	
	public ContactMechanism getMechanism() {
		return mechanism;
	}

	
	public ContactMechanismPurposeType getType() {
		return type;
	}

	public void setMechanism(ContactMechanism mechanism) {
		this.mechanism = mechanism;
	}

	public void setType(ContactMechanismPurposeType type) {
		this.type = type;
	}
}
