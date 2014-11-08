package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.shipment.model.route.ShipmentMethodType;

@Generated(value="Dali", date="2014-11-07T22:13:42.939-0700")
@StaticMetamodel(PartyRole.class)
public class PartyRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyRole, Party> roleFor;
	public static volatile SingularAttribute<PartyRole, PartyRoleType> type;
	public static volatile ListAttribute<PartyRole, ShipmentMethodType> ableToShipVia;
}
