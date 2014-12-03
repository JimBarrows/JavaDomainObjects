package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.account.Deposit;

@Generated(value="Dali", date="2014-12-02T21:45:37.477-0700")
@StaticMetamodel(Receipt.class)
public class Receipt_ extends Payment_ {
	public static volatile SingularAttribute<Receipt, Deposit> depositedVia;
}
