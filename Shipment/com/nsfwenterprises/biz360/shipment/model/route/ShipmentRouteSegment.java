package com.nsfwenterprises.biz360.shipment.model.route;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.facility.Facility;
import com.nsfwenterprises.biz360.shipment.model.Shipment;

@Entity
public class ShipmentRouteSegment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date actualArrival;
	
	private Date actualStart;
	
	private long endMileage;
	
	private Date estimatedArrival;
	
	private Date estimatedStart;
	
	private BigDecimal fuelUsed;
	
	private Shipment shipmentOf;
	
	private Facility shippedFrom;
	
	private Facility shippedTo;
	
	//private Vehicle vehicle;
	
	private ShipmentMethodType shippedVia;
	
	private PartyRole shipppedBy;
	
	private long startMileage;

	@Temporal(TemporalType.TIMESTAMP)
	public Date getActualArrival() {
		return actualArrival;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getActualStart() {
		return actualStart;
	}

	public long getEndMileage() {
		return endMileage;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEstimatedArrival() {
		return estimatedArrival;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEstimatedStart() {
		return estimatedStart;
	}

	public BigDecimal getFuelUsed() {
		return fuelUsed;
	}

	@ManyToOne
	public Shipment getShipmentOf() {
		return shipmentOf;
	}

	@ManyToOne
	public Facility getShippedFrom() {
		return shippedFrom;
	}

	@ManyToOne
	public Facility getShippedTo() {
		return shippedTo;
	}

	@ManyToOne
	public ShipmentMethodType getShippedVia() {
		return shippedVia;
	}

	@ManyToOne
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

	public void setFuelUsed(BigDecimal fuelUsed) {
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
