package mbmp.budget.model.revision;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.budget.model.Budget;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T06:11:38.724-0700")
@StaticMetamodel(BudgetRevision.class)
public class BudgetRevision_ extends BasePersistentModel_ {
	public static volatile ListAttribute<BudgetRevision, BudgetRevisionImpact> affecting;
	public static volatile SingularAttribute<BudgetRevision, Budget> revisionFor;
	public static volatile SingularAttribute<BudgetRevision, Date> revisedOn;
	public static volatile SingularAttribute<BudgetRevision, Long> sequence;
}
