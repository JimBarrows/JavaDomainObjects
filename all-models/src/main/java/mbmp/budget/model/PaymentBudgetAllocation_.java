package mbmp.budget.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.payment.Payment;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.216-0700")
@StaticMetamodel(PaymentBudgetAllocation.class)
public class PaymentBudgetAllocation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PaymentBudgetAllocation, Payment> allocationOf;
	public static volatile SingularAttribute<PaymentBudgetAllocation, BigDecimal> amount;
	public static volatile SingularAttribute<PaymentBudgetAllocation, BudgetItem> usageOf;
}
