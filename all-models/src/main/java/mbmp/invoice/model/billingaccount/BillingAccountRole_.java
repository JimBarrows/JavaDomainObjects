package mbmp.invoice.model.billingaccount;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T07:41:45.742-0700")
@StaticMetamodel(BillingAccountRole.class)
public class BillingAccountRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<BillingAccountRole, Party> accountFor;
	public static volatile SingularAttribute<BillingAccountRole, BillingAccount> roleFor;
	public static volatile SingularAttribute<BillingAccountRole, BillingAccountRoleType> type;
}
