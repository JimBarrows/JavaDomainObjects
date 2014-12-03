package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.account.Withdrawal;

@Generated(value="Dali", date="2014-12-02T21:45:37.443-0700")
@StaticMetamodel(Disbursement.class)
public class Disbursement_ extends Payment_ {
	public static volatile SingularAttribute<Disbursement, Withdrawal> affecting;
}
