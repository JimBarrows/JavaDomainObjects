package mbmp.quote.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.OrderItem;
import mbmp.product.model.Product;
import mbmp.request.model.RequestItem;

@Generated(value="Dali", date="2013-01-04T22:11:22.972-0700")
@StaticMetamodel(QuoteItem.class)
public class QuoteItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<QuoteItem, String> comment;
	public static volatile SingularAttribute<QuoteItem, Date> estimatedDeliveryDate;
	public static volatile ListAttribute<QuoteItem, OrderItem> orderItems;
	public static volatile SingularAttribute<QuoteItem, Quote> partOf;
	public static volatile SingularAttribute<QuoteItem, Product> product;
	public static volatile SingularAttribute<QuoteItem, Integer> quantity;
	public static volatile SingularAttribute<QuoteItem, RequestItem> responseTo;
	public static volatile SingularAttribute<QuoteItem, Integer> sequenceId;
	public static volatile ListAttribute<QuoteItem, QuoteTerm> terms;
	public static volatile SingularAttribute<QuoteItem, BigDecimal> unitPrice;
}
