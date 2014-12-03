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

	private ContactMechanismPurposeType	definedVia;

	private PartyContactMechanism		usedWithin;

	private DateTimeRange				dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

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
