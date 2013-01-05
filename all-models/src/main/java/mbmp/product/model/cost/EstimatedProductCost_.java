package mbmp.product.model.cost;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Organization;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.product.model.Product;
import mbmp.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2013-01-05T07:42:07.006-0700")
@StaticMetamodel(EstimatedProductCost.class)
public class EstimatedProductCost_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<EstimatedProductCost, ProductFeature> calculatedForFeature;
	public static volatile SingularAttribute<EstimatedProductCost, Product> calculatedForProduct;
	public static volatile SingularAttribute<EstimatedProductCost, CostComponentType> categorizedBy;
	public static volatile SingularAttribute<EstimatedProductCost, BigDecimal> cost;
	public static volatile SingularAttribute<EstimatedProductCost, GeographicBoundary> specifiedForGeographicBoundary;
	public static volatile SingularAttribute<EstimatedProductCost, Organization> specifiedForOrganization;
}
