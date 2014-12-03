package jdo.product.model.price;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Organization;
import jdo.party.model.PartyClassification;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-12-02T21:59:11.693-0700")
@StaticMetamodel(PriceComponent.class)
public class PriceComponent_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PriceComponent, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PriceComponent, GeographicBoundary> basedOnGeographicBoundary;
	public static volatile SingularAttribute<PriceComponent, OrderValue> basedOnOrderValue;
	public static volatile SingularAttribute<PriceComponent, PartyClassification> basedOnPartyType;
	public static volatile SingularAttribute<PriceComponent, ProductCategory> basedOnProductCategory;
	public static volatile SingularAttribute<PriceComponent, QuantityBreak> basedOnQuantityBreak;
	public static volatile SingularAttribute<PriceComponent, SaleType> basedOnSaleType;
	public static volatile SingularAttribute<PriceComponent, Money> price;
	public static volatile SingularAttribute<PriceComponent, Product> priceDefinedForProduct;
	public static volatile SingularAttribute<PriceComponent, ProductFeature> priceDefinedForProductFeature;
	public static volatile SingularAttribute<PriceComponent, Organization> specifiedFor;
	public static volatile SingularAttribute<PriceComponent, String> comment;
	public static volatile SingularAttribute<PriceComponent, Integer> percent;
}
