package jdo.shipment.model.route;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;

import jdo.model.BaseType;

@Entity
public class ShipmentMethodType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UUID of the PartyRole.
	 * 
	 */
	private List<UUID> transportationUsed;

	public List<UUID> getTransportationUsed() {
		return transportationUsed;
	}

	public void setTransportationUsed(List<UUID> transportationUsed) {
		this.transportationUsed = transportationUsed;
	}
}
