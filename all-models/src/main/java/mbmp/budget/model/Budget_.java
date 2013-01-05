package mbmp.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.budget.model.review.BudgetReview;
import mbmp.budget.model.revision.BudgetRevision;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.195-0700")
@StaticMetamodel(Budget.class)
public class Budget_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Budget, StandardTimePeriod> associatedWith;
	public static volatile SingularAttribute<Budget, String> comment;
	public static volatile ListAttribute<Budget, BudgetItem> composedOf;
	public static volatile ListAttribute<Budget, BudgetStatus> describedBy;
	public static volatile ListAttribute<Budget, BudgetRole> involving;
	public static volatile ListAttribute<Budget, BudgetReview> reviews;
	public static volatile ListAttribute<Budget, BudgetRevision> revisedBy;
	public static volatile SingularAttribute<Budget, BudgetType> type;
}
