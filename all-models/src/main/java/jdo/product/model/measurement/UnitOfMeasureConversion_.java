package jdo.product.model.measurement;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:47.775-0700")
@StaticMetamodel(UnitOfMeasureConversion.class)
public class UnitOfMeasureConversion_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<UnitOfMeasureConversion, UnitOfMeasure> fromUom;
	public static volatile SingularAttribute<UnitOfMeasureConversion, UnitOfMeasure> in;
	public static volatile SingularAttribute<UnitOfMeasureConversion, String> conversionFactor;
}
