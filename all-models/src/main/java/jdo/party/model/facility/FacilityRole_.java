package jdo.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2015-01-11T23:26:59.505-0700")
@StaticMetamodel(FacilityRole.class)
public class FacilityRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FacilityRole, FacilityRoleType> describedBy;
	public static volatile SingularAttribute<FacilityRole, Party> forParty;
	public static volatile SingularAttribute<FacilityRole, Facility> of;
	public static volatile SingularAttribute<FacilityRole, DateTimeRange> dateTimeRange;
}
