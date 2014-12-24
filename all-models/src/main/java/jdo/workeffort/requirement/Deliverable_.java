package jdo.workeffort.requirement;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:57.841-0700")
@StaticMetamodel(Deliverable.class)
public class Deliverable_ {
	public static volatile SingularAttribute<Deliverable, String> description;
	public static volatile ListAttribute<Deliverable, WorkRequirement> producedBy;
	public static volatile SingularAttribute<Deliverable, DeliverableType> type;
	public static volatile SingularAttribute<Deliverable, String> name;
}
