package jdo.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-12-24T17:30:44.800-0700")
@StaticMetamodel(AccountingPeriod.class)
public class AccountingPeriod_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<AccountingPeriod, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<AccountingPeriod, PartyRole> accountPeriodFor;
	public static volatile SingularAttribute<AccountingPeriod, PeriodType> definedBy;
	public static volatile SingularAttribute<AccountingPeriod, Integer> accountingPeriodNumber;
}
