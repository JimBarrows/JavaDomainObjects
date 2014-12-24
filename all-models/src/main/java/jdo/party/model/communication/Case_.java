package jdo.party.model.communication;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:56.161-0700")
@StaticMetamodel(Case.class)
public class Case_ {
	public static volatile SingularAttribute<Case, String> description;
	public static volatile ListAttribute<Case, CommunicationEvent> encompassing;
	public static volatile SingularAttribute<Case, CaseStatusType> inTheStateOf;
	public static volatile ListAttribute<Case, CaseRole> involving;
	public static volatile SingularAttribute<Case, Date> start;
}
