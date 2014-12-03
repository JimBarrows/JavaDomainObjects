package jdo.ecommerce.model.webcontent;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.contactmechanism.WebAddress;

@Generated(value="Dali", date="2014-12-02T21:53:26.849-0700")
@StaticMetamodel(WebContent.class)
public class WebContent_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WebContent, String> content;
	public static volatile ListAttribute<WebContent, WebContentRole> involving;
	public static volatile SingularAttribute<WebContent, WebAddress> locationOf;
	public static volatile ListAttribute<WebContent, WebContentAssociation> relatedTo;
	public static volatile SingularAttribute<WebContent, WebContentStatusType> status;
	public static volatile SingularAttribute<WebContent, WebContentType> type;
	public static volatile SingularAttribute<WebContent, String> description;
}
