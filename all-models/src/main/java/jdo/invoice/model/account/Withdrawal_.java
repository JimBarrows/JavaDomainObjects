package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.invoice.model.payment.Disbursement;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.899-0700")
@StaticMetamodel(Withdrawal.class)
public class Withdrawal_ extends FinancialAccountTransaction_ {
	public static volatile SingularAttribute<Withdrawal, Disbursement>	causedBy;
}
