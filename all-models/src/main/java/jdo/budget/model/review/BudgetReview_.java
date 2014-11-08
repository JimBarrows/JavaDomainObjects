package jdo.budget.model.review;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.Budget;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:42.184-0700")
@StaticMetamodel(BudgetReview.class)
public class BudgetReview_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetReview, Budget> forBudget;
	public static volatile SingularAttribute<BudgetReview, BudgetReviewResultType> result;
	public static volatile SingularAttribute<BudgetReview, String> comment;
	public static volatile SingularAttribute<BudgetReview, Party> ofParty;
	public static volatile SingularAttribute<BudgetReview, Date> reviewDate;
}
