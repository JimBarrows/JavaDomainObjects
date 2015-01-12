package jdo.invoice.model.payment;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.transaction.PaymentAccountingTransaction;
import jdo.budget.model.PaymentBudgetAllocation;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-12T06:49:12.616-0700")
@StaticMetamodel(Payment.class)
public class Payment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Payment, Money> amount;
	public static volatile SingularAttribute<Payment, String> comment;
	public static volatile SingularAttribute<Payment, Date> effectiveDate;
	public static volatile SingularAttribute<Payment, PaymentMethodType> paidVia;
	public static volatile SingularAttribute<Payment, String> paymentRefNum;
	public static volatile ListAttribute<Payment, PaymentApplication> usedToPay;
	public static volatile ListAttribute<Payment, PaymentBudgetAllocation> bookedAgainst;
	public static volatile SingularAttribute<Payment, PaymentAccountingTransaction> postedVia;
}
