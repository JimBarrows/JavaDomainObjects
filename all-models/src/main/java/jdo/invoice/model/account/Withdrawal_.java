package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.payment.Disbursement;

@Generated(value="Dali", date="2014-11-07T22:13:42.509-0700")
@StaticMetamodel(Withdrawal.class)
public class Withdrawal_ extends FinancialAccountTransaction_ {
	public static volatile SingularAttribute<Withdrawal, Disbursement> causedBy;
}
