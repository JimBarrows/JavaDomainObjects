package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.invoice.model.InvoiceItem;
import jdo.invoice.model.billingaccount.BillingAccount;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-12T06:50:22.244-0700")
@StaticMetamodel(PaymentApplication.class)
public class PaymentApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PaymentApplication, Money> amountApplied;
	public static volatile SingularAttribute<PaymentApplication, BillingAccount> appliedToAccount;
	public static volatile SingularAttribute<PaymentApplication, InvoiceItem> appliedToItem;
}
