package jdo.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2015-01-12T07:28:47.319-0700")
@StaticMetamodel(ShipmentReceiptRole.class)
public class ShipmentReceiptRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentReceiptRole, Party> party;
	public static volatile SingularAttribute<ShipmentReceiptRole, ShipmentReceiptRoleType> type;
}
