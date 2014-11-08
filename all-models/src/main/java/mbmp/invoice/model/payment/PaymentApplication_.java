package mbmp.invoice.model.payment;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.InvoiceItem;
import mbmp.invoice.model.billingaccount.BillingAccount;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T06:11:39.506-0700")
@StaticMetamodel(PaymentApplication.class)
public class PaymentApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PaymentApplication, BillingAccount> appliedToAccount;
	public static volatile SingularAttribute<PaymentApplication, InvoiceItem> appliedToItem;
	public static volatile SingularAttribute<PaymentApplication, BigDecimal> amountApplied;
}
