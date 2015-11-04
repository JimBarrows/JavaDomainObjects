package jdo.party.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;
import jdo.party.model.relationship.PartyRelationship;

/**
 * A person or organization may play any number of roles such as a customer,
 * supplier, employee or internal organization. Because the same party may play
 * different roles over time, we keep track of from and thru dates.
 *
 * @author Jim.Barrows@gmail.com
 * @see "Data Model Resource Book Volume 1 Figure 2.4, page 34"
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PartyRole extends BasePersistentModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The party that has the role.
	 */
	@ManyToOne
	private Party roleFor;

	/**
	 * Relationships the party is involved in, in the from role.
	 */
	@OneToMany(mappedBy = "relationshipFrom")
	private List<PartyRelationship> relationshipsInvolvedInFrom = new ArrayList<PartyRelationship>();

	/**
	 * Relationships the part is involved in in the to role.
	 */
	@OneToMany(mappedBy = "relationshipTo")
	private List<PartyRelationship> relationshipsInvolvedInTo = new ArrayList<PartyRelationship>();

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "fromDate", column = @Column(name = "roleStarted") ),
			@AttributeOverride(name = "thruDate", column = @Column(name = "roleEnded") ) })
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public PartyRole() {

	}

	public PartyRole(final Party party) {
		setRoleFor(party);
	}

	public PartyRole(final Party party, final ZonedDateTime from) {
		setRoleFor(party);
		dateTimeRange.setFromDate(from);
	}

	public PartyRole(final Party party, final ZonedDateTime from, final Optional<ZonedDateTime> thru) {
		setRoleFor(party);
		dateTimeRange.setFromDate(from);
		// TODO When hibernate fixes itself so that it can handle converters
		// with templates, get rid of the orElse.
		dateTimeRange.setThruDate(thru.orElse(null));
	}

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	@Transient
	@XmlTransient
	public List<PartyRelationship> getRelationshipsInvolvedIn() {
		final List<PartyRelationship> list = new ArrayList<>();
		list.addAll(relationshipsInvolvedInFrom);
		list.addAll(relationshipsInvolvedInTo);
		return list;
	}

	/**
	 * @return the relationshipsInvolvedInFrom
	 */
	public List<PartyRelationship> getRelationshipsInvolvedInFrom() {
		return relationshipsInvolvedInFrom;
	}

	/**
	 * @return the relationshipsInvolvedInTo
	 */
	public List<PartyRelationship> getRelationshipsInvolvedInTo() {
		return relationshipsInvolvedInTo;
	}

	public Party getRoleFor() {
		return roleFor;
	}

	/**
	 * Convenience method to determine if a role is active.
	 *
	 * @return true if it is.
	 */
	@Transient
	public boolean isActive() {
		return dateTimeRange.isActive();
	}

	public void setDateTimeRange(final DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public void setRoleFor(final Party roleFor) {
		this.roleFor = roleFor;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return String
				.format("PartyRole [roleFor=%s, relationshipsInvolvedInFrom=%s, relationshipsInvolvedInTo=%s, dateTimeRange=%s]",
						roleFor,
						relationshipsInvolvedInFrom != null ? relationshipsInvolvedInFrom.subList(0,
								Math.min(relationshipsInvolvedInFrom.size(), maxLen)) : null,
				relationshipsInvolvedInTo != null
						? relationshipsInvolvedInTo.subList(0, Math.min(relationshipsInvolvedInTo.size(), maxLen))
						: null, dateTimeRange);
	}
}
