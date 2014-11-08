package mbmp.humanresoures.model.payroll;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.payment.Paycheck;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T06:11:38.775-0700")
@StaticMetamodel(Deduction.class)
public class Deduction_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Deduction, DeductionType> type;
	public static volatile SingularAttribute<Deduction, Paycheck> reductionOf;
	public static volatile SingularAttribute<Deduction, BigDecimal> amount;
}
