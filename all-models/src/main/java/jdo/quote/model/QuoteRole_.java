package jdo.quote.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:57.562-0700")
@StaticMetamodel(QuoteRole.class)
public class QuoteRole_ {
	public static volatile SingularAttribute<QuoteRole, Party> party;
	public static volatile SingularAttribute<QuoteRole, QuoteRoleType> type;
}
