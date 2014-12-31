package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.invoice.model.payment.Payment;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-29T23:02:20.154-0700")
@StaticMetamodel(PaymentBudgetAllocation.class)
public class PaymentBudgetAllocation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PaymentBudgetAllocation, Payment> allocationOf;
	public static volatile SingularAttribute<PaymentBudgetAllocation, Money> amount;
	public static volatile SingularAttribute<PaymentBudgetAllocation, BudgetItem> usageOf;
}
