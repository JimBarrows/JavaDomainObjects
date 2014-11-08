package jdo.product.model.price;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Organization;
import jdo.party.model.PartyClassification;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-11-07T22:13:43.185-0700")
@StaticMetamodel(PriceComponent.class)
public class PriceComponent_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PriceComponent, GeographicBoundary> basedOnGeographicBoundary;
	public static volatile SingularAttribute<PriceComponent, OrderValue> basedOnOrderValue;
	public static volatile SingularAttribute<PriceComponent, PartyClassification> basedOnPartyType;
	public static volatile SingularAttribute<PriceComponent, ProductCategory> basedOnProductCategory;
	public static volatile SingularAttribute<PriceComponent, QuantityBreak> basedOnQuantityBreak;
	public static volatile SingularAttribute<PriceComponent, SaleType> basedOnSaleType;
	public static volatile SingularAttribute<PriceComponent, Product> priceDefinedForProduct;
	public static volatile SingularAttribute<PriceComponent, ProductFeature> priceDefinedForProductFeature;
	public static volatile SingularAttribute<PriceComponent, Organization> specifiedFor;
	public static volatile SingularAttribute<PriceComponent, String> comment;
	public static volatile SingularAttribute<PriceComponent, Integer> percent;
	public static volatile SingularAttribute<PriceComponent, BigDecimal> price;
}
