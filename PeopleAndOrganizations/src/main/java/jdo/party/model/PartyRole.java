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

	@OneToMany
	private List<PartyRelationship> relationshipsInvolvedIn = new ArrayList<PartyRelationship>();

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
		//TODO When hibernate fixes itself so that it can handle converters, get rid of the orElse.
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

	public List<PartyRelationship> getRelationshipsInvolvedIn() {
		return relationshipsInvolvedIn;
	}

	public void setRelationshipsInvolvedIn(List<PartyRelationship> relationshipsInvolvedIn) {
		this.relationshipsInvolvedIn = relationshipsInvolvedIn;
	}

	private static final long serialVersionUID = 1L;
}
