package jdo.budget.model.scenario;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.BudgetItemType;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.222-0700")
@StaticMetamodel(BudgetScenarioRule.class)
public class BudgetScenarioRule_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetScenario> forScenario;
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetItemType> forType;
	public static volatile SingularAttribute<BudgetScenarioRule, BigDecimal> amountChange;
	public static volatile SingularAttribute<BudgetScenarioRule, Integer> percentChange;
}
