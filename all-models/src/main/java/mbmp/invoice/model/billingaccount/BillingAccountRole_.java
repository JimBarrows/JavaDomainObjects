package mbmp.invoice.model.billingaccount;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2014-11-07T06:11:39.449-0700")
@StaticMetamodel(BillingAccountRole.class)
public class BillingAccountRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<BillingAccountRole, BillingAccount> roleFor;
	public static volatile SingularAttribute<BillingAccountRole, BillingAccountRoleType> type;
	public static volatile SingularAttribute<BillingAccountRole, Party> accountFor;
}
