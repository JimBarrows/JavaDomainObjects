package jdo.humanresoures.model.payroll;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.invoice.model.payment.Paycheck;

@Generated(value="Dali", date="2014-12-24T16:23:54.472-0700")
@StaticMetamodel(Deduction.class)
public class Deduction_ {
	public static volatile SingularAttribute<Deduction, Money> amount;
	public static volatile SingularAttribute<Deduction, DeductionType> type;
	public static volatile SingularAttribute<Deduction, Paycheck> reductionOf;
}
