package mbmp.shipment.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;
import mbmp.party.model.contactmechanism.ContactMechanism;
import mbmp.party.model.contactmechanism.PostalAddress;

@Entity
@Inheritance
public class Shipment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal actualShipCost;
	
	private Date estimatedArrivalDate;
	
	private Date estimatedReadyDate;
	
	private BigDecimal estimatedShipCost;
	
	private Date estimatedShipDate;
	
	private String handlingInstructions;
	
	private ContactMechanism inquiredAboutVia;
	
	private List<ShipmentItem> items;

	private Date lastUpdated;
	
	private Date latestCancelDate;
	
	private PostalAddress shippedFromContactMechanism;
	
	private Party shippedFromParty;
	
	private PostalAddress shippedToContactMechanism;
	
	private Party shippedToParty;
	
	private List<ShipmentStatus> statuses;
	
	public BigDecimal getActualShipCost() {
		return actualShipCost;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstimatedArrivalDate() {
		return estimatedArrivalDate;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstimatedReadyDate() {
		return estimatedReadyDate;
	}

	public BigDecimal getEstimatedShipCost() {
		return estimatedShipCost;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstimatedShipDate() {
		return estimatedShipDate;
	}

	@Lob
	public String getHandlingInstructions() {
		return handlingInstructions;
	}

	@ManyToOne
	public ContactMechanism getInquiredAboutVia() {
		return inquiredAboutVia;
	}

	@OneToMany
	@OrderBy(value="sequenceNumber")
	public List<ShipmentItem> getItems() {
		return items;
	}

	@Temporal(TemporalType.DATE)
	public Date getLastUpdated() {
		return lastUpdated;
	}

	@Temporal(TemporalType.DATE)
	public Date getLatestCancelDate() {
		return latestCancelDate;
	}

	@ManyToOne
	public ContactMechanism getShippedFromContactMechanism() {
		return shippedFromContactMechanism;
	}

	@ManyToOne
	public Party getShippedFromParty() {
		return shippedFromParty;
	}

	@ManyToOne
	public ContactMechanism getShippedToContactMechanism() {
		return shippedToContactMechanism;
	}

	@ManyToOne
	public Party getShippedToParty() {
		return shippedToParty;
	}

	@OneToMany
	@OrderBy(value="statusDate")
	public List<ShipmentStatus> getStatuses() {
		return statuses;
	}

	public void setActualShipCost(BigDecimal actualShipCost) {
		this.actualShipCost = actualShipCost;
	}

	public void setEstimatedArrivalDate(Date estimatedArrivalDate) {
		this.estimatedArrivalDate = estimatedArrivalDate;
	}

	public void setEstimatedReadyDate(Date estimatedReadyDate) {
		this.estimatedReadyDate = estimatedReadyDate;
	}
	
	public void setEstimatedShipCost(BigDecimal estimatedShipCost) {
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
