package mbmp.product.model.storage;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.facility.Facility;

@Generated(value="Dali", date="2014-11-07T21:49:20.575-0700")
@StaticMetamodel(Container.class)
public class Container_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Container, ContainerType> describedBy;
	public static volatile SingularAttribute<Container, Facility> locatedAt;
	public static volatile ListAttribute<Container, InventoryItem> storageContainerFor;
}
