package mbmp.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T07:41:45.695-0700")
@StaticMetamodel(FinancialAccountRole.class)
public class FinancialAccountRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<FinancialAccountRole, Party> accountFor;
	public static volatile SingularAttribute<FinancialAccountRole, FinancialAccountRoleType> type;
}
