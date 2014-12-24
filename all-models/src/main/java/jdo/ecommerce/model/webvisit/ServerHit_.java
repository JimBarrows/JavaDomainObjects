package jdo.ecommerce.model.webvisit;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.ecommerce.model.login.UserLogin;
import jdo.ecommerce.model.webcontent.WebContent;
import jdo.party.model.contactmechanism.IpAddress;
import jdo.party.model.contactmechanism.WebAddress;

@Generated(value="Dali", date="2014-12-24T16:23:54.368-0700")
@StaticMetamodel(ServerHit.class)
public class ServerHit_ {
	public static volatile SingularAttribute<ServerHit, UserLogin> fromUserLogin;
	public static volatile SingularAttribute<ServerHit, WebContent> hitOn;
	public static volatile SingularAttribute<ServerHit, IpAddress> identifiedBy;
	public static volatile SingularAttribute<ServerHit, Date> occuredOn;
	public static volatile SingularAttribute<ServerHit, Visit> partOf;
	public static volatile SingularAttribute<ServerHit, WebAddress> referredVia;
	public static volatile SingularAttribute<ServerHit, ServerHitStatusType> status;
	public static volatile SingularAttribute<ServerHit, UserAgent> userAgent;
	public static volatile SingularAttribute<ServerHit, Long> bytes;
}
