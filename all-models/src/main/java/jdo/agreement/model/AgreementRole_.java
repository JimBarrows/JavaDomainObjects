package jdo.agreement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-29T22:59:16.961-0700")
@StaticMetamodel(AgreementRole.class)
public class AgreementRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<AgreementRole, Party> party;
	public static volatile SingularAttribute<AgreementRole, AgreementRoleType> type;
}
