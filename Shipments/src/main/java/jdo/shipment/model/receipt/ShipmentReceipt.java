package jdo.shipment.model.receipt;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;

@Entity
public class ShipmentReceipt extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UUID of the Good.
	 * 
	 */
	private UUID good;
	/**
	 * UUID of the InventoryItem.
	 * 
	 */
	private UUID inventoryItem;
	@Lob
	private String itemDescription;
	/**
	 * UUID of the OrderItem.
	 * 
	 */
	private UUID orderItem;
	@Min(0)
	private int quantityAccepted;
	@Min(0)
	private int quantityRejected;
	@Temporal(TemporalType.TIMESTAMP)
	private Date received;
	@ManyToOne
	private RejectionReason rejectionReason;
	@OneToMany
	private List<ShipmentReceiptRole> roles;
	@ManyToOne
	private ShipmentPackage shipmentPackage;

	public UUID getGood() {
		return good;
	}

	public UUID getInventoryItem() {
		return inventoryItem;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public UUID getOrderItem() {
		return orderItem;
	}

	public int getQuantityAccepted() {
		return quantityAccepted;
	}

	public int getQuantityRejected() {
		return quantityRejected;
	}

	public Date getReceived() {
		return received;
	}

	public RejectionReason getRejectionReason() {
		return rejectionReason;
	}

	public List<ShipmentReceiptRole> getRoles() {
		return roles;
	}

	public ShipmentPackage getShipmentPackage() {
		return shipmentPackage;
	}

	public void setGood(UUID good) {
		this.good = good;
	}

	public void setInventoryItem(UUID inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public void setOrderItem(UUID orderItem) {
		this.orderItem = orderItem;
	}

	public void setQuantityAccepted(int quantityAccepted) {
		this.quantityAccepted = quantityAccepted;
	}

	public void setQuantityRejected(int quantityRejected) {
		this.quantityRejected = quantityRejected;
	}

	public void setReceived(Date received) {
		this.received = received;
	}

	public void setRejectionReason(RejectionReason rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public void setRoles(List<ShipmentReceiptRole> roles) {
		this.roles = roles;
	}

	public void setShipmentPackage(ShipmentPackage shipmentPackage) {
		this.shipmentPackage = shipmentPackage;
	}
}
