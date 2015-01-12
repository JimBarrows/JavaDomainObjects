package jdo.shipment.model.issuance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-12T06:51:24.273-0700")
@StaticMetamodel(PickList.class)
public class PickList_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PickList, Date> createdOn;
	public static volatile ListAttribute<PickList, PicklistItem> items;
}
