package mbmp.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.207-0700")
@StaticMetamodel(BudgetStatus.class)
public class BudgetStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetStatus, Budget> forBudget;
	public static volatile SingularAttribute<BudgetStatus, BudgetStatusType> type;
}
