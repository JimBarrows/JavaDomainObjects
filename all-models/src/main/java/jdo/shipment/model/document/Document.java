package jdo.shipment.model.document;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.shipment.model.Shipment;
import jdo.shipment.model.ShipmentItem;
import jdo.shipment.model.receipt.ShipmentPackage;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Document extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private ShipmentItem		forItem;

	private ShipmentPackage		forPackage;

	private Shipment			forShipment;

	@ManyToOne
	public ShipmentItem getForItem() {
		return forItem;
	}

	@ManyToOne
	public ShipmentPackage getForPackage() {
		return forPackage;
	}

	@ManyToOne
	public Shipment getForShipment() {
		return forShipment;
	}

	public void setForItem(ShipmentItem forItem) {
		this.forItem = forItem;
	}

	public void setForPackage(ShipmentPackage forPackage) {
		this.forPackage = forPackage;
	}

	public void setForShipment(Shipment forShipment) {
		this.forShipment = forShipment;
	}
}
