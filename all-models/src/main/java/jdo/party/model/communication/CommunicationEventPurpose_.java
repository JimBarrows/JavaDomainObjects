package jdo.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.587-0700")
@StaticMetamodel(CommunicationEventPurpose.class)
public class CommunicationEventPurpose_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<CommunicationEventPurpose, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<CommunicationEventPurpose, CommunicationEventPurposeType> type;
}
