package mbmp.invoice.model.payment;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.transaction.PaymentAccountingTransaction;
import mbmp.budget.model.PaymentBudgetAllocation;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T21:49:20.502-0700")
@StaticMetamodel(Payment.class)
public class Payment_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Payment, PaymentBudgetAllocation> bookedAgainst;
	public static volatile SingularAttribute<Payment, PaymentAccountingTransaction> postedVia;
	public static volatile SingularAttribute<Payment, PaymentMethodType> paidVia;
	public static volatile ListAttribute<Payment, PaymentApplication> usedToPay;
	public static volatile SingularAttribute<Payment, BigDecimal> amount;
	public static volatile SingularAttribute<Payment, String> comment;
	public static volatile SingularAttribute<Payment, Date> effectiveDate;
	public static volatile SingularAttribute<Payment, String> paymentRefNum;
}
