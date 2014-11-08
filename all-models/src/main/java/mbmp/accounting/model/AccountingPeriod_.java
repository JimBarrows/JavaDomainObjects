package mbmp.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.asset.PeriodType;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T06:11:38.497-0700")
@StaticMetamodel(AccountingPeriod.class)
public class AccountingPeriod_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<AccountingPeriod, PartyRole> accountPeriodFor;
	public static volatile SingularAttribute<AccountingPeriod, PeriodType> definedBy;
	public static volatile SingularAttribute<AccountingPeriod, Integer> accountingPeriodNumber;
}
