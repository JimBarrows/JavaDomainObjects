package mbmp.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T07:41:45.895-0700")
@StaticMetamodel(FacilityRole.class)
public class FacilityRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<FacilityRole, FacilityRoleType> describedBy;
	public static volatile SingularAttribute<FacilityRole, Party> forParty;
	public static volatile SingularAttribute<FacilityRole, Facility> of;
}
