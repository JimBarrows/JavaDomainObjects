package jdo.shipment.model;

import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Inheritance
public class Shipment extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(column = @Column(name = "actualShipCostCurrency") , name = "currency"),
			@AttributeOverride(column = @Column(name = "actualShipCostAmount") , name = "amount") })
	private Money actualShipCost;
	@Temporal(TemporalType.DATE)
	private Date estimatedArrivalDate;
	@Temporal(TemporalType.DATE)
	private Date estimatedReadyDate;
	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(column = @Column(name = "estiamtedShipCostCurrency") , name = "currency"),
			@AttributeOverride(column = @Column(name = "estiamtedShipCostAmount") , name = "amount") })
	private Money estimatedShipCost;
	@Temporal(TemporalType.DATE)
	private Date estimatedShipDate;
	@Lob
	private String handlingInstructions;
	/**
	 * UUID for the ContactMechanism.
	 * 
	 */
	private UUID inquiredAboutVia;
	@OneToMany
	@OrderBy(value = "sequenceNumber")
	private List<ShipmentItem> items;
	@Temporal(TemporalType.DATE)
	private Date lastUpdated;
	@Temporal(TemporalType.DATE)
	private Date latestCancelDate;
	/**
	 * UUID for the PostalAddress.
	 * 
	 */
	private UUID shippedFromContactMechanism;
	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID shippedFromParty;
	/**
	 * UUID of the PostalAddress.
	 * 
	 */
	private UUID shippedToContactMechanism;

	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID shippedToParty;
	@OneToMany
	@OrderBy(value = "statusDate")
	private List<ShipmentStatus> statuses;

	public Money getActualShipCost() {
		return actualShipCost;
	}

	public Date getEstimatedArrivalDate() {
		return estimatedArrivalDate;
	}

	public Date getEstimatedReadyDate() {
		return estimatedReadyDate;
	}

	public Money getEstimatedShipCost() {
		return estimatedShipCost;
	}

	public Date getEstimatedShipDate() {
		return estimatedShipDate;
	}

	public String getHandlingInstructions() {
		return handlingInstructions;
	}

	public UUID getInquiredAboutVia() {
		return inquiredAboutVia;
	}

	public List<ShipmentItem> getItems() {
		return items;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public Date getLatestCancelDate() {
		return latestCancelDate;
	}

	public UUID getShippedFromContactMechanism() {
		return shippedFromContactMechanism;
	}

	public UUID getShippedFromParty() {
		return shippedFromParty;
	}

	public UUID getShippedToContactMechanism() {
		return shippedToContactMechanism;
	}

	public UUID getShippedToParty() {
		return shippedToParty;
	}

	public List<ShipmentStatus> getStatuses() {
		return statuses;
	}

	public void setActualShipCost(Money actualShipCost) {
		this.actualShipCost = actualShipCost;
	}

	public void setEstimatedArrivalDate(Date estimatedArrivalDate) {
		this.estimatedArrivalDate = estimatedArrivalDate;
	}

	public void setEstimatedReadyDate(Date estimatedReadyDate) {
		this.estimatedReadyDate = estimatedReadyDate;
	}

	public void setEstimatedShipCost(Money estimatedShipCost) {
		this.estimatedShipCost = estimatedShipCost;
	}

	public void setEstimatedShipDate(Date estimatedShipDate) {
		this.estimatedShipDate = estimatedShipDate;
	}

	public void setHandlingInstructions(String handlingInstructions) {
		this.handlingInstructions = handlingInstructions;
	}

	public void setInquiredAboutVia(UUID inquiredAboutVia) {
		this.inquiredAboutVia = inquiredAboutVia;
	}

	public void setItems(List<ShipmentItem> items) {
		this.items = items;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public void setLatestCancelDate(Date latestCancelDate) {
		this.latestCancelDate = latestCancelDate;
	}

	public void setShippedFromContactMechanism(UUID shippedFromContactMechanism) {
		this.shippedFromContactMechanism = shippedFromContactMechanism;
	}

	public void setShippedFromParty(UUID shippedFromParty) {
		this.shippedFromParty = shippedFromParty;
	}

	public void setShippedToContactMechanism(UUID shippedToContactMechanism) {
		this.shippedToContactMechanism = shippedToContactMechanism;
	}

	public void setShippedToParty(UUID shippedToParty) {
		this.shippedToParty = shippedToParty;
	}

	public void setStatuses(List<ShipmentStatus> statuses) {
		this.statuses = statuses;
	}
}
