package mbmp.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T08:07:17.129-0700")
@StaticMetamodel(CaseRole.class)
public class CaseRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<CaseRole, CaseRoleType> describedBy;
	public static volatile SingularAttribute<CaseRole, Party> of;
	public static volatile SingularAttribute<CaseRole, Case> roleFor;
}
