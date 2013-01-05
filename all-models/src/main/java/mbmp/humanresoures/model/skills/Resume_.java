package mbmp.humanresoures.model.skills;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.455-0700")
@StaticMetamodel(Resume.class)
public class Resume_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Resume, Date> dateReceived;
	public static volatile SingularAttribute<Resume, String> text;
}
