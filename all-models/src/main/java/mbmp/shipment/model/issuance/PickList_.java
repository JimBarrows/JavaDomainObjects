package mbmp.shipment.model.issuance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:23.290-0700")
@StaticMetamodel(PickList.class)
public class PickList_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PickList, Date> createdOn;
	public static volatile ListAttribute<PickList, PicklistItem> items;
}
