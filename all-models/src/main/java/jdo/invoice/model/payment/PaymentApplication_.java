package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.invoice.model.InvoiceItem;
import jdo.invoice.model.billingaccount.BillingAccount;

@Generated(value="Dali", date="2014-12-24T16:23:55.861-0700")
@StaticMetamodel(PaymentApplication.class)
public class PaymentApplication_ {
	public static volatile SingularAttribute<PaymentApplication, Money> amountApplied;
	public static volatile SingularAttribute<PaymentApplication, BillingAccount> appliedToAccount;
	public static volatile SingularAttribute<PaymentApplication, InvoiceItem> appliedToItem;
}
