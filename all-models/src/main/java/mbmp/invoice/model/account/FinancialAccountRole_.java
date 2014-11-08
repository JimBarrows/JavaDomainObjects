package mbmp.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2014-11-07T06:11:39.410-0700")
@StaticMetamodel(FinancialAccountRole.class)
public class FinancialAccountRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<FinancialAccountRole, FinancialAccountRoleType> type;
	public static volatile SingularAttribute<FinancialAccountRole, Party> accountFor;
}
