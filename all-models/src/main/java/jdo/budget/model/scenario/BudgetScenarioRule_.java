package jdo.budget.model.scenario;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.BudgetItemType;
import jdo.fields.Money;

@Generated(value="Dali", date="2014-12-24T16:23:54.108-0700")
@StaticMetamodel(BudgetScenarioRule.class)
public class BudgetScenarioRule_ {
	public static volatile SingularAttribute<BudgetScenarioRule, Money> amountChange;
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetScenario> forScenario;
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetItemType> forType;
	public static volatile SingularAttribute<BudgetScenarioRule, Integer> percentChange;
}
