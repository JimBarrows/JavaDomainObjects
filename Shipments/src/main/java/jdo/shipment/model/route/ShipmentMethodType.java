package jdo.shipment.model.route;

import jdo.model.Type;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;

@Entity
public class ShipmentMethodType extends Type {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UUID of the PartyRole.
	 * 
	 */
	@ElementCollection
	private List<UUID> transportationUsed;

	public List<UUID> getTransportationUsed() {
		return transportationUsed;
	}

	public void setTransportationUsed(List<UUID> transportationUsed) {
		this.transportationUsed = transportationUsed;
	}
}
