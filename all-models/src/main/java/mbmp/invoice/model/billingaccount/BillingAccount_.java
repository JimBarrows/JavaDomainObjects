package mbmp.invoice.model.billingaccount;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.Invoice;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-05T07:41:45.734-0700")
@StaticMetamodel(BillingAccount.class)
public class BillingAccount_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<BillingAccount, ContactMechanism> billedAt;
	public static volatile ListAttribute<BillingAccount, Invoice> billedFor;
	public static volatile SingularAttribute<BillingAccount, String> description;
	public static volatile ListAttribute<BillingAccount, BillingAccountRole> usedBy;
}
