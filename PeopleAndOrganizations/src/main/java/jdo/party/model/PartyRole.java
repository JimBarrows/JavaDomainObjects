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
import javax.xml.bind.annotation.XmlList;
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

	@ManyToOne
	private Party roleFor;

	@OneToMany(mappedBy = "relationshipFrom")
	@XmlList
	private List<PartyRelationship> relationshipsInvolvedInFrom = new ArrayList<PartyRelationship>();

	@OneToMany(mappedBy = "relationshipTo")
	@XmlList
	private List<PartyRelationship> relationshipsInvolvedInTo = new ArrayList<PartyRelationship>();

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "fromDate", column = @Column(name = "roleStarted") ),
			@AttributeOverride(name = "thruDate", column = @Column(name = "roleEnded") ) })
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PartyRole() {

	}

	public PartyRole(ZonedDateTime from, Optional<ZonedDateTime> thru) {
		dateTimeRange.setFromDate(from);
		// TODO When hibernate fixes itself so that it can handle converters
		// with templates, get rid of the orElse.
		dateTimeRange.setThruDate(thru.orElse(null));
	}

	public PartyRole(ZonedDateTime from) {
		dateTimeRange.setFromDate(from);
	}

	public Party getRoleFor() {
		return roleFor;
	}

	public void setRoleFor(Party roleFor) {
		this.roleFor = roleFor;
	}

	@Transient
	@XmlTransient
	public List<PartyRelationship> getRelationshipsInvolvedIn() {
		List<PartyRelationship> list = new ArrayList<>();
		list.addAll(relationshipsInvolvedInFrom);
		list.addAll(relationshipsInvolvedInTo);
		return list;
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

	private static final long serialVersionUID = 1L;
}
