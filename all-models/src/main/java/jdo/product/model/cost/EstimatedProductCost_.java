package jdo.product.model.cost;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Organization;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-12-02T21:59:11.666-0700")
@StaticMetamodel(EstimatedProductCost.class)
public class EstimatedProductCost_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<EstimatedProductCost, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<EstimatedProductCost, ProductFeature> calculatedForFeature;
	public static volatile SingularAttribute<EstimatedProductCost, Product> calculatedForProduct;
	public static volatile SingularAttribute<EstimatedProductCost, CostComponentType> categorizedBy;
	public static volatile SingularAttribute<EstimatedProductCost, Money> cost;
	public static volatile SingularAttribute<EstimatedProductCost, GeographicBoundary> specifiedForGeographicBoundary;
	public static volatile SingularAttribute<EstimatedProductCost, Organization> specifiedForOrganization;
}
