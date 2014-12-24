package jdo.product.model.storage;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.facility.Facility;
import jdo.product.model.Good;

@Generated(value="Dali", date="2014-12-24T16:23:57.469-0700")
@StaticMetamodel(InventoryItem.class)
public class InventoryItem_ {
	public static volatile ListAttribute<InventoryItem, InventoryItemVariance> adjustedThru;
	public static volatile SingularAttribute<InventoryItem, InventoryItemStatusType> inTheStateOf;
	public static volatile SingularAttribute<InventoryItem, Facility> locatedAt;
	public static volatile SingularAttribute<InventoryItem, Container> locatedWithin;
	public static volatile SingularAttribute<InventoryItem, Lot> partOf;
	public static volatile SingularAttribute<InventoryItem, Good> physicalOccurenceOf;
}
