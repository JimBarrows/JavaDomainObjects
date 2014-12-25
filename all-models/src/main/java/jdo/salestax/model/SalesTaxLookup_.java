package jdo.salestax.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.category.ProductCategory;

@Generated(value="Dali", date="2014-12-24T17:30:48.686-0700")
@StaticMetamodel(SalesTaxLookup.class)
public class SalesTaxLookup_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<SalesTaxLookup, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<SalesTaxLookup, GeographicBoundary> salesTaxLookupFor;
	public static volatile SingularAttribute<SalesTaxLookup, Money> salesTaxPercentage;
	public static volatile SingularAttribute<SalesTaxLookup, ProductCategory> specifiedFor;
}
