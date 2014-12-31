package jdo.budget.model.revision;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.Budget;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-29T22:47:01.838-0700")
@StaticMetamodel(BudgetRevision.class)
public class BudgetRevision_ extends BasePersistentModel_ {
	public static volatile ListAttribute<BudgetRevision, BudgetRevisionImpact> affecting;
	public static volatile SingularAttribute<BudgetRevision, Date> revisedOn;
	public static volatile SingularAttribute<BudgetRevision, Budget> revisionFor;
	public static volatile SingularAttribute<BudgetRevision, Long> sequence;
}
