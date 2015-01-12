package jdo.party.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanism;

/**
 * Maps the relationship between a party and their contact mechanisms
 * 
 * @author jim
 * 
 */
@SuppressWarnings("serial")
@Entity
public class PartyContactMechanism extends BasePersistentModel {
	@Lob
	private String								comment;

	@ManyToOne
	private Party								mechanismToContact;

	private boolean								solicitable			= false;

	@ManyToOne
	private PartyRole							specifiedFor;

	@ManyToOne
	private ContactMechanism					specifiedVia;

	@OneToMany(mappedBy = "usedWithin")
	private List<PartyContactMechanismPurpose>	usedForThePurposeOf	= new ArrayList<PartyContactMechanismPurpose>();

	@Embedded
	private DateTimeRange						dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}



	public String getComment() {
		return comment;
	}

	
	public Party getMechanismToContact() {
		return mechanismToContact;
	}

	
	public PartyRole getSpecifiedFor() {
		return specifiedFor;
	}

	
	public ContactMechanism getSpecifiedVia() {
		return specifiedVia;
	}

	
	public List<PartyContactMechanismPurpose> getUsedForThePurposeOf() {
		return usedForThePurposeOf;
	}

	public boolean isSolicitable() {
		return solicitable;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setMechanismToContact(Party mechanismToConact) {
		this.mechanismToContact = mechanismToConact;
	}

	public void setSolicitable(boolean solicitable) {
		this.solicitable = solicitable;
	}

	public void setSpecifiedFor(PartyRole specifiedFor) {
		this.specifiedFor = specifiedFor;
	}

	public void setSpecifiedVia(ContactMechanism mechanism) {
		this.specifiedVia = mechanism;
	}

	public void setUsedForThePurposeOf(List<PartyContactMechanismPurpose> usedForThePurposeOf) {
		this.usedForThePurposeOf = usedForThePurposeOf;
	}

}
