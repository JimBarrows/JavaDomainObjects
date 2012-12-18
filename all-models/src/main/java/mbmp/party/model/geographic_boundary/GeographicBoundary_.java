package mbmp.party.model.geographic_boundary;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import mbmp.party.model.contactmechanism.PostalAddress;

@Generated(value="Dali", date="2011-12-07T19:49:02.161-0700")
@StaticMetamodel(GeographicBoundary.class)
public class GeographicBoundary_ {
	public static volatile SingularAttribute<GeographicBoundary, String> abbreviation;
	public static volatile ListAttribute<GeographicBoundary, PostalAddress> boundaryFor;
	public static volatile SingularAttribute<GeographicBoundary, String> code;
	public static volatile ListAttribute<GeographicBoundary, GeographicBoundary> contains;
	public static volatile SingularAttribute<GeographicBoundary, String> name;
	public static volatile SingularAttribute<GeographicBoundary, GeographicBoundaryType> type;
	public static volatile ListAttribute<GeographicBoundary, GeographicBoundary> within;
	public static volatile SingularAttribute<GeographicBoundary, Long> id;
	public static volatile SingularAttribute<GeographicBoundary, Long> version;
}
