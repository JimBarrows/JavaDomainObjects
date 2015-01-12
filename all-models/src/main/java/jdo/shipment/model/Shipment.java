package jdo.shipment.model;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.party.model.contactmechanism.PostalAddress;

@Entity
@Inheritance
public class Shipment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(column = @Column(name = "actualShipCostCurrency"), name = "currency"),
			@AttributeOverride(column = @Column(name = "actualShipCostAmount"), name = "amount") })
	private Money actualShipCost;
	@Temporal(TemporalType.DATE)
	private Date estimatedArrivalDate;
	@Temporal(TemporalType.DATE)
	private Date estimatedReadyDate;
	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(column = @Column(name = "estiamtedShipCostCurrency"), name = "currency"),
			@AttributeOverride(column = @Column(name = "estiamtedShipCostAmount"), name = "amount") })
	private Money estimatedShipCost;
	@Temporal(TemporalType.DATE)
	private Date estimatedShipDate;
	@Lob
	private String handlingInstructions;
	@ManyToOne
	private ContactMechanism inquiredAboutVia;
	@OneToMany
	@OrderBy(value = "sequenceNumber")
	private List<ShipmentItem> items;
	@Temporal(TemporalType.DATE)
	private Date lastUpdated;
	@Temporal(TemporalType.DATE)
	private Date latestCancelDate;
	@ManyToOne
	private PostalAddress shippedFromContactMechanism;
	@ManyToOne
	private Party shippedFromParty;
	@ManyToOne
	private PostalAddress shippedToContactMechanism;

	@ManyToOne
	private Party shippedToParty;
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

	public ContactMechanism getInquiredAboutVia() {
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

	public ContactMechanism getShippedFromContactMechanism() {
		return shippedFromContactMechanism;
	}

	public Party getShippedFromParty() {
		return shippedFromParty;
	}

	public ContactMechanism getShippedToContactMechanism() {
		return shippedToContactMechanism;
	}

	public Party getShippedToParty() {
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

	public void setInquiredAboutVia(ContactMechanism inquiredAboutVia) {
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

	public void setShippedFromContactMechanism(
			PostalAddress shippedFromContactMechanism) {
		this.shippedFromContactMechanism = shippedFromContactMechanism;
	}

	public void setShippedFromParty(Party shippedFromParty) {
		this.shippedFromParty = shippedFromParty;
	}

	public void setShippedToContactMechanism(
			PostalAddress shippedToContactMechanism) {
		this.shippedToContactMechanism = shippedToContactMechanism;
	}

	public void setShippedToParty(Party shippedToParty) {
		this.shippedToParty = shippedToParty;
	}

	public void setStatuses(List<ShipmentStatus> statuses) {
		this.statuses = statuses;
	}
}
