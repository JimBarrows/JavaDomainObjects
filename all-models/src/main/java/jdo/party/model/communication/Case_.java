package jdo.party.model.communication;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-11T23:38:12.475-0700")
@StaticMetamodel(Case.class)
public class Case_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Case, String> description;
	public static volatile ListAttribute<Case, CommunicationEvent> encompassing;
	public static volatile SingularAttribute<Case, CaseStatusType> inTheStateOf;
	public static volatile ListAttribute<Case, CaseRole> involving;
	public static volatile SingularAttribute<Case, Date> start;
}
