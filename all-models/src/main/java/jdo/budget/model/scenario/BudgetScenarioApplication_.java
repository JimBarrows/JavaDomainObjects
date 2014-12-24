package jdo.budget.model.scenario;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.Budget;
import jdo.budget.model.BudgetItem;
import jdo.fields.Money;

@Generated(value="Dali", date="2014-12-24T16:23:54.103-0700")
@StaticMetamodel(BudgetScenarioApplication.class)
public class BudgetScenarioApplication_ {
	public static volatile SingularAttribute<BudgetScenarioApplication, Budget> affectingBudget;
	public static volatile SingularAttribute<BudgetScenarioApplication, BudgetItem> affectingBudgetItem;
	public static volatile SingularAttribute<BudgetScenarioApplication, Money> amountChange;
	public static volatile SingularAttribute<BudgetScenarioApplication, BudgetScenario> fromScenario;
	public static volatile SingularAttribute<BudgetScenarioApplication, Integer> percentChange;
}
