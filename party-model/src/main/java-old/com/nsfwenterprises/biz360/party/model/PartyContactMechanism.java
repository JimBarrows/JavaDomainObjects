package com.nsfwenterprises.biz360.party.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.NotEmpty;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;

/**
 * Maps the relationship between a party and their contact mechanisms
 * 
 * @author jim
 * 
 */
@SuppressWarnings("serial")
@Entity
public class PartyContactMechanism extends BaseDateRangeModel {		
	private String comment;
	
	private Party mechanismToContact;

	private boolean solicitable = false;
	
	private PartyRole specifiedFor;

	private ContactMechanism specifiedVia;
		
	private List<PartyContactMechanismPurpose> usedForThePurposeOf = new ArrayList<PartyContactMechanismPurpose>();

	@NotEmpty
	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public Party getMechanismToContact() {
		return mechanismToContact;
	}

	@ManyToOne
	public PartyRole getSpecifiedFor() {
		return specifiedFor;
	}

	@ManyToOne
	public ContactMechanism getSpecifiedVia() {
		return specifiedVia;
	}

	@OneToMany(mappedBy="usedWithin")
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
