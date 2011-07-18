package mbmp.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.contactmechanism.ContactMechanism;
import mbmp.party.model.contactmechanism.ContactMechanismPurposeType;

@Entity
public class OrderItemContactMechanism extends BasePersistentModel {
	
	private static final long serialVersionUID = 1L;
	
	private ContactMechanism mechanism;
	
	private ContactMechanismPurposeType type;

	@NotNull
	@ManyToOne
	public ContactMechanism getMechanism() {
		return mechanism;
	}

	@NotNull
	@ManyToOne
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