package jdo.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:41.833-0700")
@StaticMetamodel(AccountingPeriod.class)
public class AccountingPeriod_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<AccountingPeriod, PartyRole> accountPeriodFor;
	public static volatile SingularAttribute<AccountingPeriod, PeriodType> definedBy;
	public static volatile SingularAttribute<AccountingPeriod, Integer> accountingPeriodNumber;
}
