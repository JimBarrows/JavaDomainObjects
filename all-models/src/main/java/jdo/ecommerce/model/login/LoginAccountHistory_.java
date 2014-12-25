package jdo.ecommerce.model.login;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:45.583-0700")
@StaticMetamodel(LoginAccountHistory.class)
public class LoginAccountHistory_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<LoginAccountHistory, Date> loggedInFrom;
	public static volatile SingularAttribute<LoginAccountHistory, Date> loggedInThru;
	public static volatile SingularAttribute<LoginAccountHistory, String> password;
	public static volatile SingularAttribute<LoginAccountHistory, String> userId;
}
