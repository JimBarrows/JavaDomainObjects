package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-11-07T22:13:43.466-0700")
@StaticMetamodel(DesiredFeature.class)
public class DesiredFeature_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<DesiredFeature, ProductFeature> describedBy;
	public static volatile SingularAttribute<DesiredFeature, Boolean> optional;
}