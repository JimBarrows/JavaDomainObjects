package jdo.ecommerce.model.subscription;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:45.656-0700")
@StaticMetamodel(SubscriptionActivity.class)
public class SubscriptionActivity_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<SubscriptionActivity, String> comment;
	public static volatile SingularAttribute<SubscriptionActivity, Date> sentOne;
	public static volatile ListAttribute<SubscriptionActivity, Subscription> subscriptionsInvolved;
}
