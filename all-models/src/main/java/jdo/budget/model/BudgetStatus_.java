package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.151-0700")
@StaticMetamodel(BudgetStatus.class)
public class BudgetStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetStatus, Budget> forBudget;
	public static volatile SingularAttribute<BudgetStatus, BudgetStatusType> type;
}
