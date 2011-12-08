package mbmp.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2011-12-07T19:49:01.967-0700")
@StaticMetamodel(CaseRole.class)
public class CaseRole_ {
	public static volatile SingularAttribute<CaseRole, CaseRoleType> describedBy;
	public static volatile SingularAttribute<CaseRole, Party> of;
	public static volatile SingularAttribute<CaseRole, Case> roleFor;
}
