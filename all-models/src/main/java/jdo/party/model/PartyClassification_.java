package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.134-0700")
@StaticMetamodel(PartyClassification.class)
public class PartyClassification_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyClassification, Party>			classificationFor;
	public static volatile SingularAttribute<PartyClassification, DateTimeRange>	dateTimeRange;
}
