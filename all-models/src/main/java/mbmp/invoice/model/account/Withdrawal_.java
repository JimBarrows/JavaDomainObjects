package mbmp.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.payment.Disbursement;

@Generated(value="Dali", date="2013-01-04T22:11:20.479-0700")
@StaticMetamodel(Withdrawal.class)
public class Withdrawal_ extends FinancialAccountTransaction_ {
	public static volatile SingularAttribute<Withdrawal, Disbursement> causedBy;
}
