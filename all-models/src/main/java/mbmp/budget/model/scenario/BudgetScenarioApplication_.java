package mbmp.budget.model.scenario;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.budget.model.Budget;
import mbmp.budget.model.BudgetItem;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.232-0700")
@StaticMetamodel(BudgetScenarioApplication.class)
public class BudgetScenarioApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetScenarioApplication, Budget> affectingBudget;
	public static volatile SingularAttribute<BudgetScenarioApplication, BudgetItem> affectingBudgetItem;
	public static volatile SingularAttribute<BudgetScenarioApplication, BigDecimal> amountChange;
	public static volatile SingularAttribute<BudgetScenarioApplication, BudgetScenario> fromScenario;
	public static volatile SingularAttribute<BudgetScenarioApplication, Integer> percentChange;
}
