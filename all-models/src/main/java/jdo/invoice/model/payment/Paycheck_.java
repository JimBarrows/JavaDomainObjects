package jdo.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.payroll.Deduction;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:42.591-0700")
@StaticMetamodel(Paycheck.class)
public class Paycheck_ extends Disbursement_ {
	public static volatile ListAttribute<Paycheck, Deduction> deductions;
	public static volatile SingularAttribute<Paycheck, PartyRole> issuedFrom;
	public static volatile SingularAttribute<Paycheck, PartyRole> issuedTo;
}