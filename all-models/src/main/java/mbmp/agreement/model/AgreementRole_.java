package mbmp.agreement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:20.114-0700")
@StaticMetamodel(AgreementRole.class)
public class AgreementRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<AgreementRole, Party> party;
	public static volatile SingularAttribute<AgreementRole, AgreementRoleType> type;
}
