package mbmp.shipment.model.issuance;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:23.266-0700")
@StaticMetamodel(ItemIssuanceRole.class)
public class ItemIssuanceRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ItemIssuanceRole, Party> roleFor;
	public static volatile SingularAttribute<ItemIssuanceRole, ItemIssuanceRoleType> type;
}
