package jdo.agreement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:53.891-0700")
@StaticMetamodel(AgreementRole.class)
public class AgreementRole_ {
	public static volatile SingularAttribute<AgreementRole, Party> party;
	public static volatile SingularAttribute<AgreementRole, AgreementRoleType> type;
}
