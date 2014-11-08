package jdo.quote.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:43.323-0700")
@StaticMetamodel(QuoteRole.class)
public class QuoteRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<QuoteRole, Party> party;
	public static volatile SingularAttribute<QuoteRole, QuoteRoleType> type;
}
