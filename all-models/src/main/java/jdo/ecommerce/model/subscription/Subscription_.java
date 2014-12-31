package jdo.ecommerce.model.subscription;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.ecommerce.model.productdescriptions.NeedType;
import jdo.ecommerce.model.productdescriptions.PartyNeed;
import jdo.model.BasePersistentModel_;
import jdo.order.model.OrderItem;
import jdo.party.model.PartyRole;
import jdo.party.model.communication.CommunicationEvent;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;

@Generated(value="Dali", date="2014-12-31T07:22:23.527-0700")
@StaticMetamodel(Subscription.class)
public class Subscription_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Subscription, Date> endDate;
	public static volatile ListAttribute<Subscription, SubscriptionActivity> fullfilledVia;
	public static volatile SingularAttribute<Subscription, NeedType> needType;
	public static volatile ListAttribute<Subscription, OrderItem> orderedVia;
	public static volatile SingularAttribute<Subscription, CommunicationEvent> originatingFrom;
	public static volatile SingularAttribute<Subscription, PartyNeed> partyNeed;
	public static volatile SingularAttribute<Subscription, Product> product;
	public static volatile SingularAttribute<Subscription, ProductCategory> productCategory;
	public static volatile SingularAttribute<Subscription, ContactMechanism> sendTo;
	public static volatile SingularAttribute<Subscription, Date> startDate;
	public static volatile SingularAttribute<Subscription, PartyRole> subscriber;
	public static volatile SingularAttribute<Subscription, PartyRole> subscriptionFor;
	public static volatile SingularAttribute<Subscription, SubscriptionType> type;
}
