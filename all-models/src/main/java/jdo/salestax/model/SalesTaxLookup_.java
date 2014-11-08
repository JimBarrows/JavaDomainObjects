package jdo.salestax.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.category.ProductCategory;

@Generated(value="Dali", date="2014-11-07T22:13:43.516-0700")
@StaticMetamodel(SalesTaxLookup.class)
public class SalesTaxLookup_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<SalesTaxLookup, GeographicBoundary> salesTaxLookupFor;
	public static volatile SingularAttribute<SalesTaxLookup, ProductCategory> specifiedFor;
	public static volatile SingularAttribute<SalesTaxLookup, BigDecimal> salesTaxPercentage;
}
