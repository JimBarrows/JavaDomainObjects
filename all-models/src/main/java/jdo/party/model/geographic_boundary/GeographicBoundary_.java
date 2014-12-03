package jdo.party.model.geographic_boundary;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.contactmechanism.PostalAddress;
import jdo.product.model.supplier.ReorderGuideline;
import jdo.salestax.model.SalesTaxLookup;

@Generated(value="Dali", date="2014-11-07T22:13:42.891-0700")
@StaticMetamodel(GeographicBoundary.class)
public class GeographicBoundary_ {
	public static volatile ListAttribute<GeographicBoundary, SalesTaxLookup> salesTaxLookup;
	public static volatile ListAttribute<GeographicBoundary, PostalAddress> boundaryFor;
	public static volatile ListAttribute<GeographicBoundary, GeographicBoundary> contains;
	public static volatile SingularAttribute<GeographicBoundary, GeographicBoundaryType> type;
	public static volatile ListAttribute<GeographicBoundary, GeographicBoundary> within;
	public static volatile ListAttribute<GeographicBoundary, ReorderGuideline> reorderGuideline;
	public static volatile SingularAttribute<GeographicBoundary, Long> id;
	public static volatile SingularAttribute<GeographicBoundary, Long> version;
	public static volatile SingularAttribute<GeographicBoundary, String> abbreviation;
	public static volatile SingularAttribute<GeographicBoundary, String> code;
	public static volatile SingularAttribute<GeographicBoundary, String> name;
}
