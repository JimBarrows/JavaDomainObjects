package jdo.humanresoures.model.position.salary;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.347-0700")
@StaticMetamodel(PayGrade.class)
public class PayGrade_ extends BasePersistentModel_ {
	public static volatile ListAttribute<PayGrade, SalaryStep> steps;
	public static volatile SingularAttribute<PayGrade, String> comment;
	public static volatile SingularAttribute<PayGrade, String> name;
}