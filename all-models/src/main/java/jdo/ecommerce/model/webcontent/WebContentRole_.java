package jdo.ecommerce.model.webcontent;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-02T21:53:26.858-0700")
@StaticMetamodel(WebContentRole.class)
public class WebContentRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WebContentRole, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<WebContentRole, Party> roleOf;
	public static volatile SingularAttribute<WebContentRole, WebContentRoleType> type;
}
