package jdo.agreement.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.agreement.model.item.AgreementItem;
import jdo.agreement.model.term.AgreementTerm;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.party.model.relationship.PartyRelationship;

@Generated(value="Dali", date="2014-11-07T22:13:42.062-0700")
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