package mbmp.shipment.model.route;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseType_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-04T22:11:23.406-0700")
@StaticMetamodel(ShipmentMethodType.class)
public class ShipmentMethodType_ extends BaseType_ {
	public static volatile ListAttribute<ShipmentMethodType, PartyRole> transportationUsed;
}
