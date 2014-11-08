package mbmp.agreement.model.item;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.agreement.model.Addendum;
import mbmp.agreement.model.Agreement;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Organization;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.product.model.Product;

@Generated(value="Dali", date="2014-11-07T06:11:38.643-0700")
@StaticMetamodel(AgreementItem.class)
public class AgreementItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<AgreementItem, Addendum> addendums;
	public static volatile ListAttribute<AgreementItem, AgreementItem> composedOf;
	public static volatile ListAttribute<AgreementItem, GeographicBoundary> geographicBoundaries;
	public static volatile ListAttribute<AgreementItem, Organization> organizations;
	public static volatile SingularAttribute<AgreementItem, Agreement> partOf;
	public static volatile ListAttribute<AgreementItem, Product> products;
	public static volatile SingularAttribute<AgreementItem, String> text;
	public static volatile SingularAttribute<AgreementItem, String> image;
	public static volatile SingularAttribute<AgreementItem, Integer> sequenceId;
}
