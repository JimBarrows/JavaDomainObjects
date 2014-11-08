package jdo.product.model.cost;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Organization;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-11-07T22:13:43.038-0700")
@StaticMetamodel(EstimatedProductCost.class)
public class EstimatedProductCost_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<EstimatedProductCost, ProductFeature> calculatedForFeature;
	public static volatile SingularAttribute<EstimatedProductCost, Product> calculatedForProduct;
	public static volatile SingularAttribute<EstimatedProductCost, CostComponentType> categorizedBy;
	public static volatile SingularAttribute<EstimatedProductCost, GeographicBoundary> specifiedForGeographicBoundary;
	public static volatile SingularAttribute<EstimatedProductCost, Organization> specifiedForOrganization;
	public static volatile SingularAttribute<EstimatedProductCost, BigDecimal> cost;
}
