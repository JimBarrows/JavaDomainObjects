package jdo.product.model.supplier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyRole;
import jdo.party.model.facility.Facility;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Good;

@Generated(value="Dali", date="2014-11-07T22:13:43.300-0700")
@StaticMetamodel(ReorderGuideline.class)
public class ReorderGuideline_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ReorderGuideline, Facility> basedOnFacility;
	public static volatile SingularAttribute<ReorderGuideline, GeographicBoundary> basedOnGeographicBoundary;
	public static volatile SingularAttribute<ReorderGuideline, PartyRole> basedOnInternalOrganization;
	public static volatile SingularAttribute<ReorderGuideline, Good> guidelineFor;
	public static volatile SingularAttribute<ReorderGuideline, Long> reorderLevel;
	public static volatile SingularAttribute<ReorderGuideline, Long> reorderQuantity;
}
