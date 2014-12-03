package jdo.shipment.model.route;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import jdo.model.BaseType;
import jdo.party.model.PartyRole;

@Entity
public class ShipmentMethodType extends BaseType {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private List<PartyRole>		transportationUsed;

	@ManyToMany(mappedBy = "ableToShipVia")
	public List<PartyRole> getTransportationUsed() {
		return transportationUsed;
	}

	public void setTransportationUsed(List<PartyRole> transportationUsed) {
		this.transportationUsed = transportationUsed;
	}
}
