package jdo.party.model.relationship;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
 


import jdo.model.BaseDateRangeModel;
import jdo.party.model.PartyRole;
import jdo.party.model.PartyRoleType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.jayefem.log4e.MethodParameterStyle;

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
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(PartyRelationship.class);

	private RelationshipType type;

	private String comment;

	private PriorityType priority;

	private PartyRole relationshipFrom;

	private PartyRole relationshipTo;

	private StatusType status;

	public PartyRelationship() {
		super();
	}

	public PartyRelationship(RelationshipType type, String comment,
			PartyRole from, PartyRole to) {
		super();
		this.comment = comment;
		relationshipFrom = from;
		relationshipTo = to;
		this.type = type;
	}

	public PartyRelationship(Long id, Long version, DateTime from,
			DateTime thru, RelationshipType type, String comment,
			PartyRole relationshipFrom, PartyRole relationshipTo) {
		super(id, version, from, thru);
		this.type = type;
		this.comment = comment;
		this.relationshipFrom = relationshipFrom;
		this.relationshipTo = relationshipTo;
	}

	public PartyRelationship(DateTime from, DateTime thru,
			RelationshipType type, String comment, PartyRole relationshipFrom,
			PartyRole relationshipTo) {
		super(from, thru);
		this.type = type;
		this.comment = comment;
		this.relationshipFrom = relationshipFrom;
		this.relationshipTo = relationshipTo;
	}

	@Transient
	@AssertFalse
	public boolean isRelationshipRolesNull() {
		return relationshipFrom == null || relationshipTo == null;
	}

	@Transient
	@AssertFalse(message = "Relationship cannot be to the same party.")
	public boolean isTheRelationshipToSameParty() {
		logger.debug("isTheRelationshipToSameParty() - " + new ToStringBuilder("", MethodParameterStyle.METHOD_PARAMETER_STYLE).append("PartyRole relationshipFrom.roleFor", relationshipFrom.getRoleFor()).append("PartyRole relationshipTo.roleFor", relationshipTo.getRoleFor()).toString()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

		return relationshipFrom.getRoleFor()
				.equals(relationshipTo.getRoleFor());
	}

	@Transient
	@AssertTrue(message = "The from role, must of the same type as the Realtionship Type from role")
	public boolean isTheFromRoleSameAsRelationshipoTypeFromRole() {
		PartyRoleType left = relationshipFrom.getType();
		PartyRoleType right = type.getFromRoleType();
		return left.equals(right);
	}

	@Transient
	@AssertTrue(message = "The to role, must of the same type as the Realtionship Type to role")
	public boolean isTheToRoleTypeSameAsRelationshipoTypeToRole() {
		PartyRoleType left = relationshipTo.getType();
		PartyRoleType right = type.getToRoleType();

		logger.debug("isTheToRoleTypeSameAsRelationshipoTypeToRole() - left=" + left + ", right=" + right); //$NON-NLS-1$ //$NON-NLS-2$

		return left.equals(right);
	}

	@ManyToOne(optional = false, targetEntity = RelationshipType.class)
	@NotNull
	public RelationshipType getType() {
		return type;
	}

	public void setType(RelationshipType type) {
		this.type = type;
	}

	@NotEmpty
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public PriorityType getPriority() {
		return priority;
	}

	@ManyToOne(optional = false, targetEntity = PartyRole.class)
	@NotNull
	protected PartyRole getRelationshipFrom() {
		return relationshipFrom;
	}

	@ManyToOne(optional = false, targetEntity = PartyRole.class)
	@NotNull
	protected PartyRole getRelationshipTo() {
		return relationshipTo;
	}

	@ManyToOne(targetEntity = StatusType.class)
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

		if (!(obj instanceof PartyRelationship)) {
			return false;
		}
		PartyRelationship rhs = (PartyRelationship) obj;
		return new EqualsBuilder().appendSuper(super.equals(rhs))
				.append(type, rhs.type).append(comment, rhs.comment)
				.append(relationshipFrom, rhs.relationshipFrom)
				.append(relationshipTo, rhs.relationshipTo).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(type)
				.append(comment).append(relationshipFrom)
				.append(relationshipTo).toHashCode();

	}
}