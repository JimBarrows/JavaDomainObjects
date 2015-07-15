package jdo.party.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

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

	/**A list of UUID's for ShipmentMethodType objects.
	 * 
	 */
	@ManyToMany
	private List<UUID> ableToShipVia = new ArrayList<UUID>();

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "fromDate", column = @Column(name = "roleStarted")),
			@AttributeOverride(name = "thruDate", column = @Column(name = "roleEnded")) })
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
		dateTimeRange.setThruDate(thru);
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

	public List<UUID> getAbleToShipVia() {
		return ableToShipVia;
	}

	public void setAbleToShipVia(List<UUID> ableToShipvia) {
		this.ableToShipVia = ableToShipvia;
	}

	private static final long serialVersionUID = 1L;
}
