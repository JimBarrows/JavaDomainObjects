package jdo.budget.model.scenario;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-29T23:04:47.367-0700")
@StaticMetamodel(BudgetScenario.class)
public class BudgetScenario_ extends BasePersistentModel_ {
	public static volatile ListAttribute<BudgetScenario, BudgetScenarioRule> affectedBy;
	public static volatile ListAttribute<BudgetScenario, BudgetScenarioApplication> affecting;
	public static volatile SingularAttribute<BudgetScenario, String> description;
}
