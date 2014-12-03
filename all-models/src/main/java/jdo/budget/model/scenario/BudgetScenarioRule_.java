package jdo.budget.model.scenario;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.BudgetItemType;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:59:11.117-0700")
@StaticMetamodel(BudgetScenarioRule.class)
public class BudgetScenarioRule_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetScenarioRule, Money> amountChange;
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetScenario> forScenario;
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetItemType> forType;
	public static volatile SingularAttribute<BudgetScenarioRule, Integer> percentChange;
}
