package jdo.humanresoures.model.payroll;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.invoice.model.payment.Paycheck;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:59:11.181-0700")
@StaticMetamodel(Deduction.class)
public class Deduction_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Deduction, Money> amount;
	public static volatile SingularAttribute<Deduction, DeductionType> type;
	public static volatile SingularAttribute<Deduction, Paycheck> reductionOf;
}
