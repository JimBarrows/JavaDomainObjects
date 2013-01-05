package mbmp.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.shipment.model.route.ShipmentMethodType;

@Generated(value="Dali", date="2013-01-05T07:41:45.992-0700")
@StaticMetamodel(PartyRole.class)
public class PartyRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyRole, Party> roleFor;
	public static volatile SingularAttribute<PartyRole, PartyRoleType> type;
	public static volatile ListAttribute<PartyRole, ShipmentMethodType> ableToShipVia;
}
