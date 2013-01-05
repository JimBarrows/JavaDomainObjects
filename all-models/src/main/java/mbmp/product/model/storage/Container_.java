package mbmp.product.model.storage;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.facility.Facility;

@Generated(value="Dali", date="2013-01-04T22:11:22.857-0700")
@StaticMetamodel(Container.class)
public class Container_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Container, ContainerType> describedBy;
	public static volatile SingularAttribute<Container, Facility> locatedAt;
}
