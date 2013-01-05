package mbmp.agreement.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.agreement.model.item.AgreementItem;
import mbmp.agreement.model.term.AgreementTerm;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.party.model.relationship.PartyRelationship;

@Generated(value="Dali", date="2013-01-05T07:41:45.274-0700")
@StaticMetamodel(Agreement.class)
public class Agreement_ extends BaseDateRangeModel_ {
	public static volatile ListAttribute<Agreement, Addendum> addendums;
	public static volatile SingularAttribute<Agreement, PartyRelationship> associatedWith;
	public static volatile SingularAttribute<Agreement, Date> date;
	public static volatile SingularAttribute<Agreement, String> description;
	public static volatile ListAttribute<Agreement, GeographicBoundary> geographicalApplicability;
	public static volatile ListAttribute<Agreement, AgreementItem> items;
	public static volatile ListAttribute<Agreement, AgreementRole> roles;
	public static volatile ListAttribute<Agreement, AgreementTerm> terms;
	public static volatile SingularAttribute<Agreement, String> text;
	public static volatile SingularAttribute<Agreement, AgreementType> type;
}
