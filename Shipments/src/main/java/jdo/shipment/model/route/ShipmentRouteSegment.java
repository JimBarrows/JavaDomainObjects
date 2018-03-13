package jdo.shipment.model.route;

import jdo.fields.Money;
import jdo.model.PersistentEntity;
import jdo.shipment.model.Shipment;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class ShipmentRouteSegment extends PersistentEntity {

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
	/**
	 * UUID of the Facility.
	 * 
	 */
	private UUID shippedFrom;
	/**
	 * UUID of the Facility.
	 * 
	 */
	private UUID shippedTo;
	/**
	 * UUID of the Vehicle.
	 * 
	 */
	private UUID vehicle;

	public UUID getVehicle() {
		return vehicle;
	}

	public void setVehicle(UUID vehicle) {
		this.vehicle = vehicle;
	}

	@ManyToOne
	private ShipmentMethodType shippedVia;
	/**
	 * UUID of the PartyRole.
	 * 
	 */
	private UUID shipppedBy;

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

	public UUID getShippedFrom() {
		return shippedFrom;
	}

	public UUID getShippedTo() {
		return shippedTo;
	}

	public ShipmentMethodType getShippedVia() {
		return shippedVia;
	}

	public UUID getShipppedBy() {
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

	public void setShippedFrom(UUID shippedFrom) {
		this.shippedFrom = shippedFrom;
	}

	public void setShippedTo(UUID shippedTo) {
		this.shippedTo = shippedTo;
	}

	public void setShippedVia(ShipmentMethodType shippedVia) {
		this.shippedVia = shippedVia;
	}

	public void setShipppedBy(UUID shipppedBy) {
		this.shipppedBy = shipppedBy;
	}

	public void setStartMileage(long startMileage) {
		this.startMileage = startMileage;
	}

}
