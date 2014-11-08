package mbmp.invoice.model.billingaccount;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.Invoice;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-11-07T06:11:39.441-0700")
@StaticMetamodel(BillingAccount.class)
public class BillingAccount_ extends BaseDateRangeModel_ {
	public static volatile ListAttribute<BillingAccount, Invoice> billedFor;
	public static volatile ListAttribute<BillingAccount, BillingAccountRole> usedBy;
	public static volatile SingularAttribute<BillingAccount, ContactMechanism> billedAt;
	public static volatile SingularAttribute<BillingAccount, String> description;
}
