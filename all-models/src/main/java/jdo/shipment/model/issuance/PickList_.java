package jdo.shipment.model.issuance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:57.700-0700")
@StaticMetamodel(PickList.class)
public class PickList_ {
	public static volatile SingularAttribute<PickList, Date> createdOn;
	public static volatile ListAttribute<PickList, PicklistItem> items;
}
