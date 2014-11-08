package jdo.budget.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.revision.BudgetRevisionImpact;
import jdo.model.BasePersistentModel_;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-11-07T22:13:42.131-0700")
@StaticMetamodel(BudgetItem.class)
public class BudgetItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<BudgetItem, RequirementBudgetAllocation> providesFundingVia;
	public static volatile ListAttribute<BudgetItem, OrderItem> usedToBuy;
	public static volatile ListAttribute<BudgetItem, PaymentBudgetAllocation> usedToPay;
	public static volatile ListAttribute<BudgetItem, BudgetRevisionImpact> affectedBy;
	public static volatile ListAttribute<BudgetItem, BudgetItem> composedOf;
	public static volatile SingularAttribute<BudgetItem, BudgetItemType> type;
	public static volatile SingularAttribute<BudgetItem, BigDecimal> amount;
	public static volatile SingularAttribute<BudgetItem, String> justification;
	public static volatile SingularAttribute<BudgetItem, String> purpose;
}
