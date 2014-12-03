package jdo.agreement.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.412-0700")
@StaticMetamodel(Addendum.class)
public class Addendum_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Addendum, Date>	creationDate;
	public static volatile SingularAttribute<Addendum, Date>	effectiveDate;
	public static volatile SingularAttribute<Addendum, String>	text;
}
