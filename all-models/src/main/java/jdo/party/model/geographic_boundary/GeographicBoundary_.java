package jdo.party.model.geographic_boundary;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.contactmechanism.PostalAddress;
import jdo.product.model.supplier.ReorderGuideline;
import jdo.salestax.model.SalesTaxLookup;

@Generated(value="Dali", date="2015-01-12T16:01:03.283-0700")
@StaticMetamodel(GeographicBoundary.class)
public class GeographicBoundary_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<GeographicBoundary, String> abbreviation;
	public static volatile ListAttribute<GeographicBoundary, PostalAddress> boundaryFor;
	public static volatile SingularAttribute<GeographicBoundary, String> code;
	public static volatile ListAttribute<GeographicBoundary, GeographicBoundary> contains;
	public static volatile SingularAttribute<GeographicBoundary, String> name;
	public static volatile SingularAttribute<GeographicBoundary, GeographicBoundaryType> type;
	public static volatile ListAttribute<GeographicBoundary, GeographicBoundary> within;
	public static volatile ListAttribute<GeographicBoundary, ReorderGuideline> reorderGuideline;
	public static volatile ListAttribute<GeographicBoundary, SalesTaxLookup> salesTaxLookup;
}
