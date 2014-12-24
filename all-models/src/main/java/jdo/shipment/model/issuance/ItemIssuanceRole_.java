package jdo.shipment.model.issuance;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:57.691-0700")
@StaticMetamodel(ItemIssuanceRole.class)
public class ItemIssuanceRole_ {
	public static volatile SingularAttribute<ItemIssuanceRole, Party> roleFor;
	public static volatile SingularAttribute<ItemIssuanceRole, ItemIssuanceRoleType> type;
}
