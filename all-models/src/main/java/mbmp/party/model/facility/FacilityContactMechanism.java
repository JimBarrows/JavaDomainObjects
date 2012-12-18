package mbmp.party.model.facility;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import mbmp.model.BaseDateRangeModel;
import mbmp.party.model.contactmechanism.ContactMechanism;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:29 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.11, page 59"
 */
@SuppressWarnings("serial")
@Entity
public class FacilityContactMechanism extends BaseDateRangeModel{
	
	private Facility mechansimToContact;

	private ContactMechanism specifiedVia;

	@NotNull
	@ManyToOne
	public Facility getMechansimToContact() {
		return mechansimToContact;
	}

	@NotNull
	@ManyToOne
	public ContactMechanism getSpecifiedVia() {
		return specifiedVia;
	}

	public void setMechansimToContact(Facility mechansimToContact) {
		this.mechansimToContact = mechansimToContact;
	}

	public void setSpecifiedVia(ContactMechanism specifiedVia) {
		this.specifiedVia = specifiedVia;
	}



}