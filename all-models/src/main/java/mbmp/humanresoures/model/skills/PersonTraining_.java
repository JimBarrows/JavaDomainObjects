package mbmp.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Person;

@Generated(value="Dali", date="2013-01-05T07:41:45.676-0700")
@StaticMetamodel(PersonTraining.class)
public class PersonTraining_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PersonTraining, Person> receivedBy;
	public static volatile SingularAttribute<PersonTraining, TrainingClassType> type;
}
