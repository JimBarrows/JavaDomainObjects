package jdo.ecommerce.model.webvisit;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-31T07:27:15.650-0700")
@StaticMetamodel(UserAgent.class)
public class UserAgent_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<UserAgent, BrowserType> browser;
	public static volatile SingularAttribute<UserAgent, UserAgentMethodType> methodType;
	public static volatile SingularAttribute<UserAgent, PlatformType> platform;
	public static volatile SingularAttribute<UserAgent, ProtocolType> protocolType;
	public static volatile SingularAttribute<UserAgent, UserAgentType> type;
}
