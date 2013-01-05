package mbmp.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2013-01-04T22:11:23.109-0700")
@StaticMetamodel(DesiredFeature.class)
public class DesiredFeature_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<DesiredFeature, ProductFeature> describedBy;
	public static volatile SingularAttribute<DesiredFeature, Boolean> optional;
}
