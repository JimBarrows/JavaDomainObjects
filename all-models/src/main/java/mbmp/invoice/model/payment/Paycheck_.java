package mbmp.invoice.model.payment;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.payroll.Deduction;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-04T22:11:20.500-0700")
@StaticMetamodel(Paycheck.class)
public class Paycheck_ extends Disbursement_ {
	public static volatile ListAttribute<Paycheck, Deduction> deductions;
	public static volatile SingularAttribute<Paycheck, PartyRole> issuedFrom;
	public static volatile SingularAttribute<Paycheck, PartyRole> issuedTo;
}
