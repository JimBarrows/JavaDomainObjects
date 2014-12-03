package jdo.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.product.model.measurement.UnitOfMeasure;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.193-0700")
@StaticMetamodel(Dimension.class)
public class Dimension_ extends ProductFeature_ {
	public static volatile SingularAttribute<Dimension, UnitOfMeasure>	measuredUsing;
}
