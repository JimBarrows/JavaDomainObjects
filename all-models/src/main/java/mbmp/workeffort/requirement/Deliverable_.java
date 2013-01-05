package mbmp.workeffort.requirement;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:23.608-0700")
@StaticMetamodel(Deliverable.class)
public class Deliverable_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Deliverable, String> description;
	public static volatile SingularAttribute<Deliverable, String> name;
	public static volatile ListAttribute<Deliverable, WorkRequirement> producedBy;
	public static volatile SingularAttribute<Deliverable, DeliverableType> type;
}
