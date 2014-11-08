package jdo.shipment.model.route;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseType_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:43.596-0700")
@StaticMetamodel(ShipmentMethodType.class)
public class ShipmentMethodType_ extends BaseType_ {
	public static volatile ListAttribute<ShipmentMethodType, PartyRole> transportationUsed;
}
