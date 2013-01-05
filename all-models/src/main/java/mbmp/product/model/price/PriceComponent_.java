package mbmp.product.model.price;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Organization;
import mbmp.party.model.PartyClassification;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.product.model.Product;
import mbmp.product.model.category.ProductCategory;
import mbmp.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2013-01-05T07:42:07.142-0700")
@StaticMetamodel(PriceComponent.class)
public class PriceComponent_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PriceComponent, GeographicBoundary> basedOnGeographicBoundary;
	public static volatile SingularAttribute<PriceComponent, OrderValue> basedOnOrderValue;
	public static volatile SingularAttribute<PriceComponent, PartyClassification> basedOnPartyType;
	public static volatile SingularAttribute<PriceComponent, ProductCategory> basedOnProductCategory;
	public static volatile SingularAttribute<PriceComponent, QuantityBreak> basedOnQuantityBreak;
	public static volatile SingularAttribute<PriceComponent, SaleType> basedOnSaleType;
	public static volatile SingularAttribute<PriceComponent, String> comment;
	public static volatile SingularAttribute<PriceComponent, Integer> percent;
	public static volatile SingularAttribute<PriceComponent, BigDecimal> price;
	public static volatile SingularAttribute<PriceComponent, Product> priceDefinedForProduct;
	public static volatile SingularAttribute<PriceComponent, ProductFeature> priceDefinedForProductFeature;
	public static volatile SingularAttribute<PriceComponent, Organization> specifiedFor;
}
