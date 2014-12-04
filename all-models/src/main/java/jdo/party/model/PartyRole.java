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

	public PartyRole(DateTime from, DateTime thru) {
		dateTimeRange.setFrom(from);
		dateTimeRange.setThru(thru);
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

	@ManyToMany
	public List<ShipmentMethodType> getAbleToShipVia() {
		return ableToShipVia;
	}

	public void setAbleToShipVia(List<ShipmentMethodType> ableToShipvia) {
		this.ableToShipVia = ableToShipvia;
	}

	private static final long	serialVersionUID	= 1L;
}
