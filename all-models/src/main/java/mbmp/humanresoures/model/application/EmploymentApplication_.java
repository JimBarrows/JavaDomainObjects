package mbmp.humanresoures.model.application;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.Position;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Person;

@Generated(value="Dali", date="2013-01-04T22:11:20.239-0700")
@StaticMetamodel(EmploymentApplication.class)
public class EmploymentApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<EmploymentApplication, Date> applicationDate;
	public static volatile SingularAttribute<EmploymentApplication, Position> forPosition;
	public static volatile SingularAttribute<EmploymentApplication, Person> fromPerson;
	public static volatile SingularAttribute<EmploymentApplication, Person> referredBy;
	public static volatile SingularAttribute<EmploymentApplication, EmploymnetApplicationSourceType> source;
	public static volatile SingularAttribute<EmploymentApplication, EmploymentApplicationStatusType> status;
}
