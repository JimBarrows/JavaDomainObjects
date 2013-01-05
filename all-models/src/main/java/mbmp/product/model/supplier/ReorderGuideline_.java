package mbmp.product.model.supplier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;
import mbmp.party.model.facility.Facility;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.product.model.Good;

@Generated(value="Dali", date="2013-01-05T07:42:07.231-0700")
@StaticMetamodel(ReorderGuideline.class)
public class ReorderGuideline_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ReorderGuideline, Facility> basedOnFacility;
	public static volatile SingularAttribute<ReorderGuideline, GeographicBoundary> basedOnGeographicBoundary;
	public static volatile SingularAttribute<ReorderGuideline, PartyRole> basedOnInternalOrganization;
	public static volatile SingularAttribute<ReorderGuideline, Good> guidelineFor;
	public static volatile SingularAttribute<ReorderGuideline, Long> reorderLevel;
	public static volatile SingularAttribute<ReorderGuideline, Long> reorderQuantity;
}
