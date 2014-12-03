package jdo.agreement.model.item;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.agreement.model.Addendum;
import jdo.agreement.model.Agreement;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Organization;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.452-0700")
@StaticMetamodel(AgreementItem.class)
public class AgreementItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<AgreementItem, Addendum>			addendums;
	public static volatile ListAttribute<AgreementItem, AgreementItem>		composedOf;
	public static volatile ListAttribute<AgreementItem, GeographicBoundary>	geographicBoundaries;
	public static volatile ListAttribute<AgreementItem, Organization>		organizations;
	public static volatile SingularAttribute<AgreementItem, Agreement>		partOf;
	public static volatile ListAttribute<AgreementItem, Product>			products;
	public static volatile SingularAttribute<AgreementItem, String>			text;
	public static volatile SingularAttribute<AgreementItem, String>			image;
	public static volatile SingularAttribute<AgreementItem, Integer>		sequenceId;
}
