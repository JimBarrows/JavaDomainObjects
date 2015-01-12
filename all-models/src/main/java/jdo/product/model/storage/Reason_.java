package jdo.product.model.storage;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-11T23:34:02.373-0700")
@StaticMetamodel(Reason.class)
public class Reason_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Reason, String> description;
	public static volatile ListAttribute<Reason, InventoryItemVariance> explanationFor;
}
