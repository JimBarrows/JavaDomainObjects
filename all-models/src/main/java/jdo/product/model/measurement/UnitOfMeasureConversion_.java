package jdo.product.model.measurement;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:43.146-0700")
@StaticMetamodel(UnitOfMeasureConversion.class)
public class UnitOfMeasureConversion_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<UnitOfMeasureConversion, UnitOfMeasure> fromUom;
	public static volatile SingularAttribute<UnitOfMeasureConversion, UnitOfMeasure> in;
	public static volatile SingularAttribute<UnitOfMeasureConversion, String> conversionFactor;
}