package jdo.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Person;

@Generated(value="Dali", date="2014-12-02T21:59:11.320-0700")
@StaticMetamodel(PersonTraining.class)
public class PersonTraining_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PersonTraining, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PersonTraining, TrainingClassType> type;
	public static volatile SingularAttribute<PersonTraining, Person> receivedBy;
}
