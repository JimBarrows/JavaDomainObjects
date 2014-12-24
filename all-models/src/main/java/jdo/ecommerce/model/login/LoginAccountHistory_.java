package jdo.ecommerce.model.login;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:54.135-0700")
@StaticMetamodel(LoginAccountHistory.class)
public class LoginAccountHistory_ {
	public static volatile SingularAttribute<LoginAccountHistory, Date> loggedInFrom;
	public static volatile SingularAttribute<LoginAccountHistory, Date> loggedInThru;
	public static volatile SingularAttribute<LoginAccountHistory, String> password;
	public static volatile SingularAttribute<LoginAccountHistory, String> userId;
}
