package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T16:34:41.457-0700")
@StaticMetamodel(PartyClassification.class)
public class PartyClassification_ {
	public static volatile SingularAttribute<PartyClassification, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyClassification, Party> classificationFor;
}
