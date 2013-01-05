package mbmp.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.asset.PeriodType;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-05T07:41:45.155-0700")
@StaticMetamodel(AccountingPeriod.class)
public class AccountingPeriod_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<AccountingPeriod, Integer> accountingPeriodNumber;
	public static volatile SingularAttribute<AccountingPeriod, PartyRole> accountPeriodFor;
	public static volatile SingularAttribute<AccountingPeriod, PeriodType> definedBy;
}
