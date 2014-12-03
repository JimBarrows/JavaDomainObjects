package jdo.shipment.model.issuance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:45:38.650-0700")
@StaticMetamodel(PickList.class)
public class PickList_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PickList, Date> createdOn;
	public static volatile ListAttribute<PickList, PicklistItem> items;
}
