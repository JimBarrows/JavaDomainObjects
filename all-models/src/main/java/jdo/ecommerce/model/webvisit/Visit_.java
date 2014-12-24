package jdo.ecommerce.model.webvisit;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.order.model.Order;
import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.WebAddress;

@Generated(value="Dali", date="2014-12-24T16:23:54.398-0700")
@StaticMetamodel(Visit.class)
public class Visit_ {
	public static volatile ListAttribute<Visit, ServerHit> composedOf;
	public static volatile SingularAttribute<Visit, WebAddress> hostedVia;
	public static volatile SingularAttribute<Visit, Order> resultingIn;
	public static volatile SingularAttribute<Visit, PartyRole> visitedBy;
	public static volatile SingularAttribute<Visit, Date> visitEnd;
	public static volatile SingularAttribute<Visit, Date> visitStart;
	public static volatile SingularAttribute<Visit, String> cookie;
}
