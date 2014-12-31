package jdo.invoice.model.billingaccount;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-31T07:52:14.558-0700")
@StaticMetamodel(BillingAccountRole.class)
public class BillingAccountRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BillingAccountRole, Party> accountFor;
	public static volatile SingularAttribute<BillingAccountRole, BillingAccount> roleFor;
	public static volatile SingularAttribute<BillingAccountRole, BillingAccountRoleType> type;
	public static volatile SingularAttribute<BillingAccountRole, DateTimeRange> dateTimeRange;
}
