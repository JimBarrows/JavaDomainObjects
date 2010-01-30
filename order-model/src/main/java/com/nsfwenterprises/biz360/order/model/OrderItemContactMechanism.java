package com.nsfwenterprises.biz360.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanismPurposeType;

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