package jdo.shipment.model.route;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.accounting.model.asset.Vehicle;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.party.model.PartyRole;
import jdo.party.model.facility.Facility;
import jdo.shipment.model.Shipment;

@Entity
public class ShipmentRouteSegment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.TIMESTAMP)
	private Date actualArrival;
	@Temporal(TemporalType.TIMESTAMP)
	private Date actualStart;

	private long endMileage;
	@Temporal(TemporalType.TIMESTAMP)
	private Date estimatedArrival;
	@Temporal(TemporalType.TIMESTAMP)
	private Date estimatedStart;
	@Embedded
	private Money fuelUsed;
	@ManyToOne
	private Shipment shipmentOf;
	@ManyToOne
	private Facility shippedFrom;
	@ManyToOne
	private Facility shippedTo;

	private Vehicle vehicle;
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@ManyToOne
	private ShipmentMethodType shippedVia;
	@ManyToOne
	private PartyRole shipppedBy;

	private long startMileage;

	public Date getActualArrival() {
		return actualArrival;
	}

	public Date getActualStart() {
		return actualStart;
	}

	public long getEndMileage() {
		return endMileage;
	}

	public Date getEstimatedArrival() {
		return estimatedArrival;
	}

	public Date getEstimatedStart() {
		return estimatedStart;
	}

	public Money getFuelUsed() {
		return fuelUsed;
	}

	public Shipment getShipmentOf() {
		return shipmentOf;
	}

	public Facility getShippedFrom() {
		return shippedFrom;
	}

	public Facility getShippedTo() {
		return shippedTo;
	}

	public ShipmentMethodType getShippedVia() {
		return shippedVia;
	}

	public PartyRole getShipppedBy() {
		return shipppedBy;
	}

	public long getStartMileage() {
		return startMileage;
	}

	public void setActualArrival(Date actualArrival) {
		this.actualArrival = actualArrival;
	}

	public void setActualStart(Date actualStart) {
		this.actualStart = actualStart;
	}

	public void setEndMileage(long endMileage) {
		this.endMileage = endMileage;
	}

	public void setEstimatedArrival(Date estimatedArrival) {
		this.estimatedArrival = estimatedArrival;
	}

	public void setEstimatedStart(Date estimatedStart) {
		this.estimatedStart = estimatedStart;
	}

	public void setFuelUsed(Money fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

	public void setShipmentOf(Shipment shipmentOf) {
		this.shipmentOf = shipmentOf;
	}

	public void setShippedFrom(Facility shippedFrom) {
		this.shippedFrom = shippedFrom;
	}

	public void setShippedTo(Facility shippedTo) {
		this.shippedTo = shippedTo;
	}

	public void setShippedVia(ShipmentMethodType shippedVia) {
		this.shippedVia = shippedVia;
	}

	public void setShipppedBy(PartyRole shipppedBy) {
		this.shipppedBy = shipppedBy;
	}

	public void setStartMileage(long startMileage) {
		this.startMileage = startMileage;
	}

}
