package mbmp.salestax.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.product.model.category.ProductCategory;

@Generated(value="Dali", date="2013-01-05T07:42:07.363-0700")
@StaticMetamodel(SalesTaxLookup.class)
public class SalesTaxLookup_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<SalesTaxLookup, GeographicBoundary> salesTaxLookupFor;
	public static volatile SingularAttribute<SalesTaxLookup, BigDecimal> salesTaxPercentage;
	public static volatile SingularAttribute<SalesTaxLookup, ProductCategory> specifiedFor;
}
