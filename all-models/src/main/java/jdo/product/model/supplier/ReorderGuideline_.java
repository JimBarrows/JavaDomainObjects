package jdo.product.model.supplier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;
import jdo.party.model.facility.Facility;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Good;

@Generated(value="Dali", date="2014-12-24T16:34:41.974-0700")
@StaticMetamodel(ReorderGuideline.class)
public class ReorderGuideline_ {
	public static volatile SingularAttribute<ReorderGuideline, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<ReorderGuideline, Facility> basedOnFacility;
	public static volatile SingularAttribute<ReorderGuideline, GeographicBoundary> basedOnGeographicBoundary;
	public static volatile SingularAttribute<ReorderGuideline, PartyRole> basedOnInternalOrganization;
	public static volatile SingularAttribute<ReorderGuideline, Good> guidelineFor;
	public static volatile SingularAttribute<ReorderGuideline, Long> reorderLevel;
	public static volatile SingularAttribute<ReorderGuideline, Long> reorderQuantity;
}
