package jdo.product.model.storage;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.341-0700")
@StaticMetamodel(Lot.class)
public class Lot_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Lot, Date>			creationDate;
	public static volatile SingularAttribute<Lot, Date>			expirationDate;
	public static volatile ListAttribute<Lot, InventoryItem>	madeUpOf;
	public static volatile SingularAttribute<Lot, Long>			quantity;
}
