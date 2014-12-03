package jdo.product.model.storage;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.facility.Facility;

@Generated(value="Dali", date="2014-12-02T21:45:38.350-0700")
@StaticMetamodel(Container.class)
public class Container_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Container, ContainerType> describedBy;
	public static volatile SingularAttribute<Container, Facility> locatedAt;
	public static volatile ListAttribute<Container, InventoryItem> storageContainerFor;
}
