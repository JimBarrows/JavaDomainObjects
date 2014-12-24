package jdo.ecommerce.model.login;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:54.179-0700")
@StaticMetamodel(WebUserPreference.class)
public class WebUserPreference_ {
	public static volatile SingularAttribute<WebUserPreference, WebPreferenceType> describedBy;
	public static volatile SingularAttribute<WebUserPreference, UserLogin> preferenceFor;
	public static volatile SingularAttribute<WebUserPreference, String> value;
}
