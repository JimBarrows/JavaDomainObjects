package jdo.product.model.measurement;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-11-07T22:13:43.137-0700")
@StaticMetamodel(UnitOfMeasure.class)
public class UnitOfMeasure_ extends BasePersistentModel_ {
	public static volatile ListAttribute<UnitOfMeasure, UnitOfMeasureConversion> convertedFrom;
	public static volatile ListAttribute<UnitOfMeasure, UnitOfMeasureConversion> convertedTo;
	public static volatile SingularAttribute<UnitOfMeasure, String> description;
	public static volatile ListAttribute<UnitOfMeasure, Product> usedIn;
	public static volatile SingularAttribute<UnitOfMeasure, String> abbreviation;
}