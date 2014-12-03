package jdo.humanresoures.model.position;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.300-0700")
@StaticMetamodel(ValidResponsibility.class)
public class ValidResponsibility_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ValidResponsibility, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<ValidResponsibility, PositionType> associatedWith;
	public static volatile SingularAttribute<ValidResponsibility, String> comment;
	public static volatile SingularAttribute<ValidResponsibility, ResponsibilityType> definedBy;
}
