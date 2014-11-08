package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.account.Withdrawal;

@Generated(value="Dali", date="2014-11-07T22:13:42.581-0700")
@StaticMetamodel(Disbursement.class)
public class Disbursement_ extends Payment_ {
	public static volatile SingularAttribute<Disbursement, Withdrawal> affecting;
}
