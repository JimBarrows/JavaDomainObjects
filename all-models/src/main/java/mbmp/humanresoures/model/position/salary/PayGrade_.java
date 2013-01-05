package mbmp.humanresoures.model.position.salary;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.293-0700")
@StaticMetamodel(PayGrade.class)
public class PayGrade_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PayGrade, String> comment;
	public static volatile SingularAttribute<PayGrade, String> name;
	public static volatile ListAttribute<PayGrade, SalaryStep> steps;
}
