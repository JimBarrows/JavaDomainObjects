package jdo.ecommerce.model.webcontent;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-31T07:24:38.267-0700")
@StaticMetamodel(WebContentAssociation.class)
public class WebContentAssociation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WebContentAssociation, WebContent> forWebContent;
	public static volatile SingularAttribute<WebContentAssociation, FunctionType> functionType;
	public static volatile SingularAttribute<WebContentAssociation, WebContent> ofWebContent;
	public static volatile SingularAttribute<WebContentAssociation, Integer> xLoc;
	public static volatile SingularAttribute<WebContentAssociation, Integer> yLoc;
}
