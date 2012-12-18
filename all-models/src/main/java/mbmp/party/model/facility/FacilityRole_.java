package mbmp.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2011-12-07T19:49:02.135-0700")
@StaticMetamodel(FacilityRole.class)
public class FacilityRole_ {
	public static volatile SingularAttribute<FacilityRole, FacilityRoleType> describedBy;
	public static volatile SingularAttribute<FacilityRole, Party> forParty;
	public static volatile SingularAttribute<FacilityRole, Facility> of;
}
