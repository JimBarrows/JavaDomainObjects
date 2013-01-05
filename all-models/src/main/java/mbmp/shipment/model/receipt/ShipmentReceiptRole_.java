package mbmp.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T08:07:18.051-0700")
@StaticMetamodel(ShipmentReceiptRole.class)
public class ShipmentReceiptRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentReceiptRole, Party> party;
	public static volatile SingularAttribute<ShipmentReceiptRole, ShipmentReceiptRoleType> type;
}
