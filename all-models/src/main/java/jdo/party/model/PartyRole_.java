package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.shipment.model.route.ShipmentMethodType;

@Generated(value="Dali", date="2014-12-03T08:37:31.848-0700")
@StaticMetamodel(PartyRole.class)
public class PartyRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyRole, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyRole, Party> roleFor;
	public static volatile ListAttribute<PartyRole, ShipmentMethodType> ableToShipVia;
}
