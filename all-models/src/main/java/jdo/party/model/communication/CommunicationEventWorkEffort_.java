package jdo.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.workeffort.WorkEffort;

@Generated(value="Dali", date="2015-01-12T16:00:34.081-0700")
@StaticMetamodel(CommunicationEventWorkEffort.class)
public class CommunicationEventWorkEffort_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<CommunicationEventWorkEffort, String> description;
	public static volatile SingularAttribute<CommunicationEventWorkEffort, WorkEffort> effortFor;
	public static volatile SingularAttribute<CommunicationEventWorkEffort, CommunicationEvent> eventFrom;
}
