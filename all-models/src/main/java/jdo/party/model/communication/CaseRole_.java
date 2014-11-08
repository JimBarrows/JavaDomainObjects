package jdo.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:42.796-0700")
@StaticMetamodel(CaseRole.class)
public class CaseRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<CaseRole, CaseRoleType> describedBy;
	public static volatile SingularAttribute<CaseRole, Party> of;
	public static volatile SingularAttribute<CaseRole, Case> roleFor;
}
