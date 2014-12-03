package jdo.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.payment.Payment;

@Generated(value="Dali", date="2014-12-02T21:45:36.779-0700")
@StaticMetamodel(PaymentAccountingTransaction.class)
public class PaymentAccountingTransaction_ extends ExternalAccountingTransaction_ {
	public static volatile SingularAttribute<PaymentAccountingTransaction, Payment> originatedFrom;
}
