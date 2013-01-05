package mbmp.request.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:23.019-0700")
@StaticMetamodel(Request.class)
public class Request_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Request, String> description;
	public static volatile ListAttribute<Request, RequestItem> items;
	public static volatile SingularAttribute<Request, Date> requestDate;
	public static volatile ListAttribute<Request, RespondingParty> respondingParties;
	public static volatile SingularAttribute<Request, Date> responseRequired;
	public static volatile ListAttribute<Request, RequestRole> roles;
}
