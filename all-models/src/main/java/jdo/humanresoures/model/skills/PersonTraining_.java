package jdo.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Person;

@Generated(value="Dali", date="2014-11-07T22:13:42.417-0700")
@StaticMetamodel(PersonTraining.class)
public class PersonTraining_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PersonTraining, TrainingClassType> type;
	public static volatile SingularAttribute<PersonTraining, Person> receivedBy;
}
