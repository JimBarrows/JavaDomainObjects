package jdo.workeffort.requirement;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-11T23:11:04.545-0700")
@StaticMetamodel(Deliverable.class)
public class Deliverable_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Deliverable, String> description;
	public static volatile SingularAttribute<Deliverable, String> name;
	public static volatile ListAttribute<Deliverable, WorkRequirement> producedBy;
	public static volatile SingularAttribute<Deliverable, DeliverableType> type;
}
