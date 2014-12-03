package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.budget.model.review.BudgetReview;
import jdo.budget.model.revision.BudgetRevision;
import jdo.model.BasePersistentModel_;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.479-0700")
@StaticMetamodel(Budget.class)
public class Budget_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Budget, StandardTimePeriod>	associatedWith;
	public static volatile ListAttribute<Budget, BudgetItem>				composedOf;
	public static volatile ListAttribute<Budget, BudgetStatus>				describedBy;
	public static volatile ListAttribute<Budget, BudgetRole>				involving;
	public static volatile ListAttribute<Budget, BudgetReview>				reviews;
	public static volatile ListAttribute<Budget, BudgetRevision>			revisedBy;
	public static volatile SingularAttribute<Budget, BudgetType>			type;
	public static volatile SingularAttribute<Budget, String>				comment;
}
