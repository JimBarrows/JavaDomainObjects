package jdo.workeffort.rate;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:34:42.022-0700")
@StaticMetamodel(PartyRate.class)
public class PartyRate_ {
	public static volatile SingularAttribute<PartyRate, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyRate, Money> rate;
	public static volatile SingularAttribute<PartyRate, Party> rateFor;
	public static volatile SingularAttribute<PartyRate, RateType> rateType;
}
