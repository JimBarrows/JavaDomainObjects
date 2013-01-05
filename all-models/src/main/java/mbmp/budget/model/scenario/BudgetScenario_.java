package mbmp.budget.model.scenario;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.229-0700")
@StaticMetamodel(BudgetScenario.class)
public class BudgetScenario_ extends BasePersistentModel_ {
	public static volatile ListAttribute<BudgetScenario, BudgetScenarioRule> affectedBy;
	public static volatile ListAttribute<BudgetScenario, BudgetScenarioApplication> affecting;
	public static volatile SingularAttribute<BudgetScenario, String> description;
}
