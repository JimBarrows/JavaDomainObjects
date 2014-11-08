package jdo.party.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Entity
public class PartyContactMechanismPurpose extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		
	private ContactMechanismPurposeType definedVia;
	
	
	private PartyContactMechanism usedWithin;

	@ManyToOne
	public ContactMechanismPurposeType getDefinedVia() {
		return definedVia;
	}

	@ManyToOne
	public PartyContactMechanism getUsedWithin() {
		return usedWithin;
	}

	public void setDefinedVia(ContactMechanismPurposeType definedVia) {
		this.definedVia = definedVia;
	}

	public void setUsedWithin(PartyContactMechanism usedWithin) {
		this.usedWithin = usedWithin;
	}
}
