package jdo.ecommerce.model.productdescriptions;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.ecommerce.model.webvisit.ServerHit;
import jdo.party.model.PartyRole;
import jdo.party.model.communication.CommunicationEvent;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;

@Generated(value="Dali", date="2014-12-24T16:23:54.231-0700")
@StaticMetamodel(PartyNeed.class)
public class PartyNeed_ {
	public static volatile SingularAttribute<PartyNeed, String> description;
	public static volatile SingularAttribute<PartyNeed, CommunicationEvent> discoverdViaCommunicationEvent;
	public static volatile SingularAttribute<PartyNeed, ServerHit> discoveredViaServerHit;
	public static volatile SingularAttribute<PartyNeed, PartyRole> forConsumer;
	public static volatile SingularAttribute<PartyNeed, Product> forProduct;
	public static volatile SingularAttribute<PartyNeed, ProductCategory> forProductCategory;
	public static volatile SingularAttribute<PartyNeed, Date> identifiedOn;
	public static volatile SingularAttribute<PartyNeed, NeedType> type;
}
