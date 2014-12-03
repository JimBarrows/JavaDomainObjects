package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.613-0700")
@StaticMetamodel(PartyClassification.class)
public class PartyClassification_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyClassification, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyClassification, Party> classificationFor;
}
