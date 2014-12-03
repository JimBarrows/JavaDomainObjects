package jdo.quote.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.372-0700")
@StaticMetamodel(Quote.class)
public class Quote_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Quote, String>	description;
	public static volatile SingularAttribute<Quote, Party>	givenTo;
	public static volatile SingularAttribute<Quote, Date>	issueDate;
	public static volatile SingularAttribute<Quote, Party>	issuedBy;
	public static volatile ListAttribute<Quote, QuoteItem>	items;
	public static volatile ListAttribute<Quote, QuoteRole>	roles;
	public static volatile ListAttribute<Quote, QuoteTerm>	terms;
	public static volatile SingularAttribute<Quote, Date>	validFrom;
	public static volatile SingularAttribute<Quote, Date>	validThru;
}
