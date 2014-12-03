package jdo.party.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.shipment.model.route.ShipmentMethodType;

import org.joda.time.DateTime;

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

	private PartyRoleType				type;

	private Party						roleFor;

	private List<ShipmentMethodType>	ableToShipVia	= new ArrayList<ShipmentMethodType>();

	private DateTimeRange				dateTimeRange	= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PartyRole() {

	}

	public PartyRole(PartyRoleType type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "PartyRole [type=" + type + ", roleFor=" + roleFor + ", ableToShipVia=" + ableToShipVia + "]";
	}

	public PartyRole(DateTime from, DateTime thru, PartyRoleType type) {
		dateTimeRange.setFrom(from);
		dateTimeRange.setThru(thru);
		this.type = type;
	}

	@NotNull
	@ManyToOne
	@XmlTransient
	public Party getRoleFor() {
		return roleFor;
	}

	public void setRoleFor(Party roleFor) {
		this.roleFor = roleFor;
	}

	@NotNull
	@ManyToOne
	public PartyRoleType getType() {
		return type;
	}

	public void setType(PartyRoleType type) {
		this.type = type;
	}

	@ManyToMany
	public List<ShipmentMethodType> getAbleToShipVia() {
		return ableToShipVia;
	}

	public void setAbleToShipVia(List<ShipmentMethodType> ableToShipvia) {
		this.ableToShipVia = ableToShipvia;
	}

	private static final long	serialVersionUID	= 1L;
}
