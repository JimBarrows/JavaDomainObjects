package jdo.humanresoures.model.position;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.399-0700")
@StaticMetamodel(ValidResponsibility.class)
public class ValidResponsibility_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ValidResponsibility, PositionType> associatedWith;
	public static volatile SingularAttribute<ValidResponsibility, String> comment;
	public static volatile SingularAttribute<ValidResponsibility, ResponsibilityType> definedBy;
}
