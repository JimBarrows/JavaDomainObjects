package com.nsfwenterprises.biz360.party.model.relationship;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;

import org.hibernate.validator.AssertFalse;
import org.hibernate.validator.NotEmpty;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.PartyRole;

/**
 * A relationship is defined by the two parties and their respective roles.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:33 AM
 * @see Data Model Resource Book Volume 1 Figure 2.5, Page 41
 * @see Data Model Resource Book Volume 1 Figure 2.6a, Page 43
 * @see The Data Model Resource Book Volume 1 Figure 2.7, Page 48
 * @see Data Model Resource Book Volume 1 Figure 2.12, page 60
 */
@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PartyRelationship extends BaseDateRangeModel {
	
	private String comment;
	
	private PriorityType priority;
		
	private PartyRole relationshipFrom;
	
	private PartyRole relationshipTo;
	
	private StatusType status;
	
	@AssertFalse
	public boolean areBothNull() {
		return relationshipFrom ==null || relationshipTo == null;
	}
	
	@AssertFalse
	public boolean areBothTheSame() {
		return relationshipFrom.equals(relationshipTo);
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartyRelationship other = (PartyRelationship) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (relationshipFrom == null) {
			if (other.relationshipFrom != null)
				return false;
		} else if (!relationshipFrom.equals(other.relationshipFrom))
			return false;
		if (relationshipTo == null) {
			if (other.relationshipTo != null)
				return false;
		} else if (!relationshipTo.equals(other.relationshipTo))
			return false;
		return true;
	}

	@NotEmpty
	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public PriorityType getPriority() {
		return priority;
	}

	@ManyToOne
	protected PartyRole getRelationshipFrom() {
		return relationshipFrom;
	}

	@ManyToOne
	protected PartyRole getRelationshipTo() {
		return relationshipTo;
	}

	public StatusType getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime
				* result
				+ ((relationshipFrom == null) ? 0 : relationshipFrom.hashCode());
		result = prime * result
				+ ((relationshipTo == null) ? 0 : relationshipTo.hashCode());
		return result;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@ManyToOne
	public void setPriority(PriorityType priority) {
		this.priority = priority;
	}

	protected void setRelationshipFrom(PartyRole relationshipFrom) {
		this.relationshipFrom = relationshipFrom;
	}

	protected void setRelationshipTo(PartyRole relationshipTo) {
		this.relationshipTo = relationshipTo;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	

	

}