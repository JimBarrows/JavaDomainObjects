package jdo.budget.model.scenario;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:54.089-0700")
@StaticMetamodel(BudgetScenario.class)
public class BudgetScenario_ {
	public static volatile ListAttribute<BudgetScenario, BudgetScenarioRule> affectedBy;
	public static volatile ListAttribute<BudgetScenario, BudgetScenarioApplication> affecting;
	public static volatile SingularAttribute<BudgetScenario, String> description;
}
