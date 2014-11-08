package jdo.invoice.model.payment;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.InvoiceItem;
import jdo.invoice.model.billingaccount.BillingAccount;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.605-0700")
@StaticMetamodel(PaymentApplication.class)
public class PaymentApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PaymentApplication, BillingAccount> appliedToAccount;
	public static volatile SingularAttribute<PaymentApplication, InvoiceItem> appliedToItem;
	public static volatile SingularAttribute<PaymentApplication, BigDecimal> amountApplied;
}
