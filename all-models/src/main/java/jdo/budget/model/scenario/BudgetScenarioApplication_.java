package jdo.budget.model.scenario;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.budget.model.Budget;
import jdo.budget.model.BudgetItem;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.563-0700")
@StaticMetamodel(BudgetScenarioApplication.class)
public class BudgetScenarioApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetScenarioApplication, Budget>			affectingBudget;
	public static volatile SingularAttribute<BudgetScenarioApplication, BudgetItem>		affectingBudgetItem;
	public static volatile SingularAttribute<BudgetScenarioApplication, BudgetScenario>	fromScenario;
	public static volatile SingularAttribute<BudgetScenarioApplication, Integer>		percentChange;
	public static volatile SingularAttribute<BudgetScenarioApplication, Money>			amountChange;
}
