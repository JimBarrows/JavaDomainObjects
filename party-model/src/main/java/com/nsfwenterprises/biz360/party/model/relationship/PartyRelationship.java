package com.nsfwenterprises.biz360.party.model.relationship;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import org.hibernate.validator.constraints.NotEmpty;

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
	
	public PartyRelationship() {
		
	}
	
	public PartyRelationship(String comment, PartyRole from, PartyRole to) {
		this.comment = comment;
		relationshipFrom = from;
		relationshipTo = to;
	}
	
	@Transient
	@AssertFalse
	public boolean isRelationshipRolesNull() {
		return relationshipFrom ==null || relationshipTo == null;
	}
	
	@Transient
	@AssertFalse
	public boolean isTheRelatinshipToSameParty() {
		return relationshipFrom.equals(relationshipTo);
	}	
	
	@NotEmpty
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public PriorityType getPriority() {
		return priority;
	}

	@ManyToOne(optional=false, targetEntity=PartyRole.class)
	@NotNull
	protected PartyRole getRelationshipFrom() {
		return relationshipFrom;
	}

	@ManyToOne(optional=false, targetEntity=PartyRole.class)
	@NotNull
	protected PartyRole getRelationshipTo() {
		return relationshipTo;
	}

	@ManyToOne(targetEntity=StatusType.class)
	public StatusType getStatus() {
		return status;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}

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
}