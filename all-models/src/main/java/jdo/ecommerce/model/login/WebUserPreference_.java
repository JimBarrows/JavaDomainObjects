package jdo.ecommerce.model.login;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-13T06:28:38.054-0700")
@StaticMetamodel(WebUserPreference.class)
public class WebUserPreference_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WebUserPreference, WebPreferenceType> describedBy;
	public static volatile SingularAttribute<WebUserPreference, UserLogin> preferenceFor;
	public static volatile SingularAttribute<WebUserPreference, String> value;
}
