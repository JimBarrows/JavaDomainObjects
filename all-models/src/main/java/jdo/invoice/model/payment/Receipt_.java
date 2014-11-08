package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.account.Deposit;

@Generated(value="Dali", date="2014-11-07T22:13:42.617-0700")
@StaticMetamodel(Receipt.class)
public class Receipt_ extends Payment_ {
	public static volatile SingularAttribute<Receipt, Deposit> depositedVia;
}
