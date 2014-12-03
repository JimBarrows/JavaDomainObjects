package jdo.humanresoures.model.application;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.humanresoures.model.position.Position;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Person;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.670-0700")
@StaticMetamodel(EmploymentApplication.class)
public class EmploymentApplication_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<EmploymentApplication, Position>							forPosition;
	public static volatile SingularAttribute<EmploymentApplication, EmploymnetApplicationSourceType>	source;
	public static volatile SingularAttribute<EmploymentApplication, EmploymentApplicationStatusType>	status;
	public static volatile SingularAttribute<EmploymentApplication, Date>								applicationDate;
	public static volatile SingularAttribute<EmploymentApplication, Person>								fromPerson;
	public static volatile SingularAttribute<EmploymentApplication, Person>								referredBy;
}
