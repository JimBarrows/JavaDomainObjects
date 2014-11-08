package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:42.481-0700")
@StaticMetamodel(FinancialAccountRole.class)
public class FinancialAccountRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<FinancialAccountRole, FinancialAccountRoleType> type;
	public static volatile SingularAttribute<FinancialAccountRole, Party> accountFor;
}
