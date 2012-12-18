package mbmp.party.model.relationship;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.party.model.PartyRole;


@Entity
public class Employment extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TerminationReason dueTo;
	
//	private TerminationType terminationType;

	@ManyToOne
	public TerminationReason getDueTo() {
		return dueTo;
	}

	public PartyRole getRelationshipFrom() {
		return (PartyRole)super.getRelationshipFrom();
	}


	public PartyRole getRelationshipTo() {
		return (PartyRole)super.getRelationshipTo();
	}

/*	@ManyToOne
	public TerminationType getTerminationType() {
		return terminationType;
	}
*/

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
