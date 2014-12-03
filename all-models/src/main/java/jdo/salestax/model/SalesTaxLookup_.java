package jdo.salestax.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.category.ProductCategory;

@Generated(value="Dali", date="2014-12-02T21:13:07.772-0700")
@StaticMetamodel(SalesTaxLookup.class)
public class SalesTaxLookup_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<SalesTaxLookup, GeographicBoundary> salesTaxLookupFor;
	public static volatile SingularAttribute<SalesTaxLookup, ProductCategory> specifiedFor;
	public static volatile SingularAttribute<SalesTaxLookup, BigDecimal> salesTaxPercentage;
	public static volatile SingularAttribute<SalesTaxLookup, DateTimeRange> dateTimeRange;
}
