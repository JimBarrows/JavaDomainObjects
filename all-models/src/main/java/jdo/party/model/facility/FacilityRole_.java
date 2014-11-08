package jdo.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:42.879-0700")
@StaticMetamodel(FacilityRole.class)
public class FacilityRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<FacilityRole, FacilityRoleType> describedBy;
	public static volatile SingularAttribute<FacilityRole, Party> forParty;
	public static volatile SingularAttribute<FacilityRole, Facility> of;
}
