package jdo.quote.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.OrderItem;
import jdo.product.model.Product;
import jdo.request.model.RequestItem;

@Generated(value="Dali", date="2014-11-07T22:13:43.317-0700")
@StaticMetamodel(QuoteItem.class)
public class QuoteItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<QuoteItem, String> comment;
	public static volatile SingularAttribute<QuoteItem, Date> estimatedDeliveryDate;
	public static volatile ListAttribute<QuoteItem, OrderItem> orderItems;
	public static volatile SingularAttribute<QuoteItem, Quote> partOf;
	public static volatile SingularAttribute<QuoteItem, Product> product;
	public static volatile SingularAttribute<QuoteItem, RequestItem> responseTo;
	public static volatile ListAttribute<QuoteItem, QuoteTerm> terms;
	public static volatile SingularAttribute<QuoteItem, Integer> quantity;
	public static volatile SingularAttribute<QuoteItem, Integer> sequenceId;
	public static volatile SingularAttribute<QuoteItem, BigDecimal> unitPrice;
}