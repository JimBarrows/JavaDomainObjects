package jdo.budget.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.payment.Payment;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.171-0700")
@StaticMetamodel(PaymentBudgetAllocation.class)
public class PaymentBudgetAllocation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PaymentBudgetAllocation, BudgetItem> usageOf;
	public static volatile SingularAttribute<PaymentBudgetAllocation, Payment> allocationOf;
	public static volatile SingularAttribute<PaymentBudgetAllocation, BigDecimal> amount;
}
