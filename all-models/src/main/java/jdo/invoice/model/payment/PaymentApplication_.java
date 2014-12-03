package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.fields.Money;
import jdo.invoice.model.InvoiceItem;
import jdo.invoice.model.billingaccount.BillingAccount;
import jdo.model.BasePersistentModel_;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.978-0700")
@StaticMetamodel(PaymentApplication.class)
public class PaymentApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PaymentApplication, BillingAccount>	appliedToAccount;
	public static volatile SingularAttribute<PaymentApplication, InvoiceItem>		appliedToItem;
	public static volatile SingularAttribute<PaymentApplication, Money>				amountApplied;
}
