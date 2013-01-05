package mbmp.quote.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:22.974-0700")
@StaticMetamodel(QuoteRole.class)
public class QuoteRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<QuoteRole, Party> party;
	public static volatile SingularAttribute<QuoteRole, QuoteRoleType> type;
}
