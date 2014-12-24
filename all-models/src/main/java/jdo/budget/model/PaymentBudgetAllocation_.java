package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.invoice.model.payment.Payment;

@Generated(value="Dali", date="2014-12-24T16:23:54.009-0700")
@StaticMetamodel(PaymentBudgetAllocation.class)
public class PaymentBudgetAllocation_ {
	public static volatile SingularAttribute<PaymentBudgetAllocation, Money> amount;
	public static volatile SingularAttribute<PaymentBudgetAllocation, BudgetItem> usageOf;
	public static volatile SingularAttribute<PaymentBudgetAllocation, Payment> allocationOf;
}
