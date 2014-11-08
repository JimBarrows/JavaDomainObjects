package mbmp.humanresoures.model.position.salary;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T06:11:39.346-0700")
@StaticMetamodel(SalaryStep.class)
public class SalaryStep_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<SalaryStep, PayGrade> grade;
	public static volatile ListAttribute<SalaryStep, PayHistory> history;
	public static volatile ListAttribute<SalaryStep, PositionTypeRate> positionTypeRates;
	public static volatile SingularAttribute<SalaryStep, BigDecimal> amount;
	public static volatile SingularAttribute<SalaryStep, Date> dateModified;
	public static volatile SingularAttribute<SalaryStep, Integer> sequence;
}
