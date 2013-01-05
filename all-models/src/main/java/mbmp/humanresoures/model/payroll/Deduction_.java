package mbmp.humanresoures.model.payroll;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.payment.Paycheck;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.251-0700")
@StaticMetamodel(Deduction.class)
public class Deduction_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Deduction, Paycheck> reductionOf;
	public static volatile SingularAttribute<Deduction, BigDecimal> amount;
	public static volatile SingularAttribute<Deduction, DeductionType> type;
}
