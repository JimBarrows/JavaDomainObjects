package jdo.ecommerce.model.webcontent;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.contactmechanism.WebAddress;

@Generated(value="Dali", date="2014-12-24T16:23:54.296-0700")
@StaticMetamodel(WebContent.class)
public class WebContent_ {
	public static volatile SingularAttribute<WebContent, String> content;
	public static volatile ListAttribute<WebContent, WebContentRole> involving;
	public static volatile SingularAttribute<WebContent, WebAddress> locationOf;
	public static volatile ListAttribute<WebContent, WebContentAssociation> relatedTo;
	public static volatile SingularAttribute<WebContent, WebContentStatusType> status;
	public static volatile SingularAttribute<WebContent, WebContentType> type;
	public static volatile SingularAttribute<WebContent, String> description;
}
