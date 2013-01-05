package mbmp.budget.model.review;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.budget.model.Budget;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:20.218-0700")
@StaticMetamodel(BudgetReview.class)
public class BudgetReview_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetReview, String> comment;
	public static volatile SingularAttribute<BudgetReview, Budget> forBudget;
	public static volatile SingularAttribute<BudgetReview, Party> ofParty;
	public static volatile SingularAttribute<BudgetReview, BudgetReviewResultType> result;
	public static volatile SingularAttribute<BudgetReview, Date> reviewDate;
}
