package jdo.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:56.169-0700")
@StaticMetamodel(CaseRole.class)
public class CaseRole_ {
	public static volatile SingularAttribute<CaseRole, CaseRoleType> describedBy;
	public static volatile SingularAttribute<CaseRole, Party> of;
	public static volatile SingularAttribute<CaseRole, Case> roleFor;
}
