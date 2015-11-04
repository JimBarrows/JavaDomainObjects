package jdo.party.model.relationship;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;
import jdo.party.model.PartyRole;

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

	public void setDateTimeRange(final DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PartyRelationship() {
		super();
	}

	public PartyRelationship(final PartyRole relationshipFrom, final PartyRole relationshipTo) {
		super();
		setRelationshipFrom(relationshipFrom);
		setRelationshipTo(relationshipTo);
	}

	public PartyRelationship(final String comment, final PartyRole relationshipFrom, final PartyRole relationshipTo) {
		super();
		this.comment = comment;
		setRelationshipFrom(relationshipFrom);
		setRelationshipTo(relationshipTo);
	}

	public PartyRelationship(final UUID id, final Long version, final ZonedDateTime from,
			final Optional<ZonedDateTime> thru, final String comment, final PartyRole relationshipFrom,
			final PartyRole relationshipTo) {
		super(id, version);
		dateTimeRange.setFromDate(from);
		// TODO When hibernate fixes itself so that it can handle converters,
		// get rid of the orElse.
		dateTimeRange.setThruDate(thru.orElse(null));
		this.comment = comment;
		setRelationshipFrom(relationshipFrom);
		setRelationshipTo(relationshipTo);
	}

	public PartyRelationship(final ZonedDateTime from, final Optional<ZonedDateTime> thru, final String comment,
			final PartyRole relationshipFrom, final PartyRole relationshipTo) {
		dateTimeRange.setFromDate(from);
		// TODO When hibernate fixes itself so that it can handle converters,
		// get rid of the orElse.
		dateTimeRange.setThruDate(thru.orElse(null));
		this.comment = comment;
		setRelationshipFrom(relationshipFrom);
		setRelationshipTo(relationshipTo);
	}

	@Transient
	@AssertFalse
	public boolean isRelationshipRolesNull() {
		return (relationshipFrom == null) || (relationshipTo == null);
	}

	/**
	 *
	 * @return true when the relationship end date is after both it's members
	 *         roles expiration date.
	 */
	@Transient
	@AssertTrue
	public boolean isRelationshipEndBeforeBothRoleEnds() {
		return (relationshipFrom.getDateTimeRange().getThruDate().isAfter(dateTimeRange.getThruDate())
				|| relationshipFrom.getDateTimeRange().getThruDate().isEqual(dateTimeRange.getThruDate()))
				&& (relationshipTo.getDateTimeRange().getThruDate().isAfter(dateTimeRange.getThruDate())
						|| relationshipTo.getDateTimeRange().getThruDate().isEqual(dateTimeRange.getThruDate()));
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

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public void setPriority(final PriorityType priority) {
		this.priority = priority;
	}

	protected void setRelationshipFrom(final PartyRole relationshipFrom) {
		this.relationshipFrom = relationshipFrom;
		if ((((relationshipFrom.getDateTimeRange().getThruDate() != null)
				&& ((relationshipFrom.getDateTimeRange().getThruDate() == null)))
				|| (relationshipFrom.getDateTimeRange().getThruDate().isBefore(dateTimeRange.getThruDate())))) {
			relationshipFrom.getDateTimeRange().setThruDate(relationshipFrom.getDateTimeRange().getThruDate());
		}
	}

	protected void setRelationshipTo(final PartyRole relationshipTo) {
		this.relationshipTo = relationshipTo;
		if ((((relationshipTo.getDateTimeRange().getThruDate() != null)
				&& ((relationshipTo.getDateTimeRange().getThruDate() == null)))
				|| (relationshipTo.getDateTimeRange().getThruDate().isBefore(dateTimeRange.getThruDate())))) {
			relationshipTo.getDateTimeRange().setThruDate(relationshipTo.getDateTimeRange().getThruDate());
		}
	}

	public void setStatus(final StatusType status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format(
				"PartyRelationship [comment=%s, priority=%s, relationshipFrom=%s, relationshipTo=%s, status=%s, dateTimeRange=%s, getId()=%s, getVersion()=%s]",
				comment, priority, relationshipFrom, relationshipTo, status, dateTimeRange, getId(), getVersion());
	}

}
