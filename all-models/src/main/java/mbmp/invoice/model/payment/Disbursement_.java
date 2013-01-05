package mbmp.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.account.Withdrawal;

@Generated(value="Dali", date="2013-01-04T22:11:20.498-0700")
@StaticMetamodel(Disbursement.class)
public class Disbursement_ extends Payment_ {
	public static volatile SingularAttribute<Disbursement, Withdrawal> affecting;
}
