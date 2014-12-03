package jdo.shipment.model.receipt;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.order.model.OrderItem;
import jdo.product.model.Good;
import jdo.product.model.storage.InventoryItem;

@Entity
public class ShipmentReceipt extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	private Good						good;

	private InventoryItem				inventoryItem;

	private String						itemDescription;

	private OrderItem					orderItem;

	private int							quantityAccepted;

	private int							quantityRejected;

	private Date						received;

	private RejectionReason				rejectionReason;

	private List<ShipmentReceiptRole>	roles;

	private ShipmentPackage				shipmentPackage;

	@ManyToOne
	public Good getGood() {
		return good;
	}

	@ManyToOne
	public InventoryItem getInventoryItem() {
		return inventoryItem;
	}

	@Lob
	public String getItemDescription() {
		return itemDescription;
	}

	@ManyToOne
	public OrderItem getOrderItem() {
		return orderItem;
	}

	@Min(0)
	public int getQuantityAccepted() {
		return quantityAccepted;
	}

	@Min(0)
	public int getQuantityRejected() {
		return quantityRejected;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getReceived() {
		return received;
	}

	@ManyToOne
	public RejectionReason getRejectionReason() {
		return rejectionReason;
	}

	@OneToMany
	public List<ShipmentReceiptRole> getRoles() {
		return roles;
	}

	@ManyToOne
	public ShipmentPackage getShipmentPackage() {
		return shipmentPackage;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	public void setInventoryItem(InventoryItem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public void setOrderItem(OrderItem orderItem) {
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
