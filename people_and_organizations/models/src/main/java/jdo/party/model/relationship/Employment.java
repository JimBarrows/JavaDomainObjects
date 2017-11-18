package jdo.party.model.relationship;

import jdo.party.model.PartyRole;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;


@Entity
public class Employment extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private TerminationReason dueTo;
	
	/** UUID to the TerminationType of this employment relationshipo.
	 * 
	 */	
	private UUID terminationType;

	public TerminationReason getDueTo() {
		return dueTo;
	}

	public PartyRole getRelationshipFrom() {
		return super.getRelationshipFrom();
	}


	public PartyRole getRelationshipTo() {
		return super.getRelationshipTo();
	}


	public UUID getTerminationType() {
		return terminationType;
	}


	public void setDueTo(TerminationReason dueTo) {
		this.dueTo = dueTo;
	}

	public void setRelationshipFrom(PartyRole relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}

	public void setRelationshipTo(PartyRole relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}

}
