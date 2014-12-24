package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.review.BudgetReview;
import jdo.budget.model.revision.BudgetRevision;

@Generated(value="Dali", date="2014-12-24T16:23:53.937-0700")
@StaticMetamodel(Budget.class)
public class Budget_ {
	public static volatile SingularAttribute<Budget, StandardTimePeriod> associatedWith;
	public static volatile ListAttribute<Budget, BudgetItem> composedOf;
	public static volatile ListAttribute<Budget, BudgetStatus> describedBy;
	public static volatile ListAttribute<Budget, BudgetRole> involving;
	public static volatile ListAttribute<Budget, BudgetReview> reviews;
	public static volatile ListAttribute<Budget, BudgetRevision> revisedBy;
	public static volatile SingularAttribute<Budget, BudgetType> type;
	public static volatile SingularAttribute<Budget, String> comment;
}
