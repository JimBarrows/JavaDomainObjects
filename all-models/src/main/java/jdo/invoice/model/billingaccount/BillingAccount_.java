package jdo.invoice.model.billingaccount;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.Invoice;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-11-07T22:13:42.531-0700")
@StaticMetamodel(BillingAccount.class)
public class BillingAccount_ extends BaseDateRangeModel_ {
	public static volatile ListAttribute<BillingAccount, Invoice> billedFor;
	public static volatile ListAttribute<BillingAccount, BillingAccountRole> usedBy;
	public static volatile SingularAttribute<BillingAccount, ContactMechanism> billedAt;
	public static volatile SingularAttribute<BillingAccount, String> description;
}
