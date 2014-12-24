package jdo.ecommerce.model.subscription;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:54.263-0700")
@StaticMetamodel(SubscriptionActivity.class)
public class SubscriptionActivity_ {
	public static volatile SingularAttribute<SubscriptionActivity, String> comment;
	public static volatile SingularAttribute<SubscriptionActivity, Date> sentOne;
	public static volatile ListAttribute<SubscriptionActivity, Subscription> subscriptionsInvolved;
}
