package jdo.ecommerce.model.login;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.WebAddress;

@Generated(value="Dali", date="2014-12-31T07:15:53.572-0700")
@StaticMetamodel(UserLogin.class)
public class UserLogin_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<UserLogin, Boolean> active;
	public static volatile MapAttribute<UserLogin, String, WebUserPreference> governedBy;
	public static volatile ListAttribute<UserLogin, LoginAccountHistory> having;
	public static volatile SingularAttribute<UserLogin, Party> loginFor;
	public static volatile SingularAttribute<UserLogin, WebAddress> loginTo;
	public static volatile SingularAttribute<UserLogin, String> password;
	public static volatile SingularAttribute<UserLogin, String> userId;
}
