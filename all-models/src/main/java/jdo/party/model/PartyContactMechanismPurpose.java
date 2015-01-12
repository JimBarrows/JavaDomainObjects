package jdo.party.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Entity
public class PartyContactMechanismPurpose extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@ManyToOne
	private ContactMechanismPurposeType	definedVia;

	@ManyToOne
	private PartyContactMechanism		usedWithin;

	@Embedded
	private DateTimeRange				dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public ContactMechanismPurposeType getDefinedVia() {
		return definedVia;
	}

	
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
