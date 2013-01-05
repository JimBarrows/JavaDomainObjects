package mbmp.humanresoures.model.position;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.type.PositionType;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2013-01-05T07:41:45.612-0700")
@StaticMetamodel(ValidResponsibility.class)
public class ValidResponsibility_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ValidResponsibility, PositionType> associatedWith;
	public static volatile SingularAttribute<ValidResponsibility, String> comment;
	public static volatile SingularAttribute<ValidResponsibility, ResponsibilityType> definedBy;
}
