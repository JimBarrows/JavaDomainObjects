package mbmp.product.model.measurement;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:22.714-0700")
@StaticMetamodel(UnitOfMeasureConversion.class)
public class UnitOfMeasureConversion_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<UnitOfMeasureConversion, String> conversionFactor;
	public static volatile SingularAttribute<UnitOfMeasureConversion, UnitOfMeasure> fromUom;
	public static volatile SingularAttribute<UnitOfMeasureConversion, UnitOfMeasure> in;
}
