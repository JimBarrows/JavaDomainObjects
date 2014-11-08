package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.payment.Receipt;

@Generated(value="Dali", date="2014-11-07T22:13:42.463-0700")
@StaticMetamodel(Deposit.class)
public class Deposit_ extends FinancialAccountTransaction_ {
	public static volatile ListAttribute<Deposit, Receipt> causedBy;
}
