package mbmp.budget.model.scenario;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.budget.model.BudgetItemType;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.234-0700")
@StaticMetamodel(BudgetScenarioRule.class)
public class BudgetScenarioRule_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetScenarioRule, BigDecimal> amountChange;
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetScenario> forScenario;
	public static volatile SingularAttribute<BudgetScenarioRule, BudgetItemType> forType;
	public static volatile SingularAttribute<BudgetScenarioRule, Integer> percentChange;
}
