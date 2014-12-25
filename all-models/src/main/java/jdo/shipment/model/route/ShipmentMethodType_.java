package jdo.shipment.model.route;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-12-24T17:30:48.768-0700")
@StaticMetamodel(ShipmentMethodType.class)
public class ShipmentMethodType_ extends BasePersistentModel_ {
	public static volatile ListAttribute<ShipmentMethodType, PartyRole> transportationUsed;
}
