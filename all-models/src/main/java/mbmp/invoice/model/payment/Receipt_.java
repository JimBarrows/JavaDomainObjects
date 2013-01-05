package mbmp.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.account.Deposit;

@Generated(value="Dali", date="2013-01-04T22:11:20.508-0700")
@StaticMetamodel(Receipt.class)
public class Receipt_ extends Payment_ {
	public static volatile SingularAttribute<Receipt, Deposit> depositedVia;
}
