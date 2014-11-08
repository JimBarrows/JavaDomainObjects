package jdo.humanresoures.model.skills;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.427-0700")
@StaticMetamodel(Resume.class)
public class Resume_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Resume, Date> dateReceived;
	public static volatile SingularAttribute<Resume, String> text;
}
