package jdo.budget.model.revision;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.Budget;

@Generated(value="Dali", date="2014-12-24T16:23:54.077-0700")
@StaticMetamodel(BudgetRevision.class)
public class BudgetRevision_ {
	public static volatile ListAttribute<BudgetRevision, BudgetRevisionImpact> affecting;
	public static volatile SingularAttribute<BudgetRevision, Budget> revisionFor;
	public static volatile SingularAttribute<BudgetRevision, Date> revisedOn;
	public static volatile SingularAttribute<BudgetRevision, Long> sequence;
}
