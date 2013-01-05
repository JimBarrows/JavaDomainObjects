package mbmp.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.payment.Payment;

@Generated(value="Dali", date="2013-01-04T22:11:20.016-0700")
@StaticMetamodel(PaymentAccountingTransaction.class)
public class PaymentAccountingTransaction_ extends ExternalAccountingTransaction_ {
	public static volatile SingularAttribute<PaymentAccountingTransaction, Payment> originatedFrom;
}
