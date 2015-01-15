package jdo.party.model.relationship;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

import org.joda.time.DateTime;

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
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PartyRelationship extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String comment;

	@ManyToOne
	private PriorityType priority;

	@ManyToOne(optional = false, targetEntity = PartyRole.class)
	@NotNull
	private PartyRole relationshipFrom;
	@ManyToOne(optional = false, targetEntity = PartyRole.class)
	@NotNull
	private PartyRole relationshipTo;
	@ManyToOne(targetEntity = StatusType.class)
	private StatusType status;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PartyRelationship() {
		super();
	}

	public PartyRelationship(PartyRole relationshipFrom,
			PartyRole relationshipTo) {
		super();
		this.relationshipFrom = relationshipFrom;
		this.relationshipTo = relationshipTo;
	}

	public PartyRelationship(String comment, PartyRole from, PartyRole to) {
		super();
		this.comment = comment;
		relationshipFrom = from;
		relationshipTo = to;
	}

	public PartyRelationship(Long id, Long version, DateTime from,
			DateTime thru, String comment, PartyRole relationshipFrom,
			PartyRole relationshipTo) {
		super(id, version);
		this.dateTimeRange.setFromDate(from);
		this.dateTimeRange.setThruDate(thru);
		this.comment = comment;
		this.relationshipFrom = relationshipFrom;
		this.relationshipTo = relationshipTo;
	}

	public PartyRelationship(DateTime from, DateTime thru, String comment,
			PartyRole relationshipFrom, PartyRole relationshipTo) {
		this.dateTimeRange.setFromDate(from);
		this.dateTimeRange.setThruDate(thru);
		this.comment = comment;
		this.relationshipFrom = relationshipFrom;
		this.relationshipTo = relationshipTo;
	}

	@Transient
	@AssertFalse
	public boolean isRelationshipRolesNull() {
		return relationshipFrom == null || relationshipTo == null;
	}

	public String getComment() {
		return comment;
	}

	public PriorityType getPriority() {
		return priority;
	}

	protected PartyRole getRelationshipFrom() {
		return relationshipFrom;
	}

	protected PartyRole getRelationshipTo() {
		return relationshipTo;
	}

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
	public String toString() {
		return "PartyRelationship [comment=" + comment + ", priority="
				+ priority + ", relationshipFrom=" + relationshipFrom
				+ ", relationshipTo=" + relationshipTo + ", status=" + status
				+ ", dateTimeRange=" + dateTimeRange + ", id=" + getId()
				+ ", version=" + getVersion() + "]";
	}

}