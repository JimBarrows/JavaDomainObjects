package mbmp.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Person;

@Generated(value="Dali", date="2014-11-07T06:11:39.388-0700")
@StaticMetamodel(PersonTraining.class)
public class PersonTraining_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PersonTraining, TrainingClassType> type;
	public static volatile SingularAttribute<PersonTraining, Person> receivedBy;
}
