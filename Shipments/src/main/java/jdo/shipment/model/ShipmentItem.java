package jdo.shipment.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;

@Entity
public class ShipmentItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Lob
	private String contentsDescription;
	@Min(1)
	private int quantity;
	@Min(1)
	private int sequenceNumber;
	@OneToMany
	private List<ShipmentItem> shipmentItems;
	/**
	 * UUID of the Good.
	 * 
	 */
	private UUID shipmentOf;
	@OneToMany
	private List<OrderShipment> shipmentsOf;
	/**
	 * UUID of the ProductFeature.
	 * 
	 */
	private List<UUID> shippedWith;

	public String getContentsDescription() {
		return contentsDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public List<ShipmentItem> getShipmentItems() {
		return shipmentItems;
	}

	public UUID getShipmentOf() {
		return shipmentOf;
	}

	public List<OrderShipment> getShipmentsOf() {
		return shipmentsOf;
	}

	public List<UUID> getShippedWith() {
		return shippedWith;
	}

	public void setContentsDescription(String contentsDescription) {
		this.contentsDescription = contentsDescription;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public void setShipmentItems(List<ShipmentItem> shipmentItems) {
		this.shipmentItems = shipmentItems;
	}

	public void setShipmentOf(UUID shipmentOf) {
		this.shipmentOf = shipmentOf;
	}

	public void setShipmentsOf(List<OrderShipment> shipmentsOf) {
		this.shipmentsOf = shipmentsOf;
	}

	public void setShippedWith(List<UUID> shippedWith) {
		this.shippedWith = shippedWith;
	}
}
