package jdo.agreement.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.agreement.model.item.AgreementItem;
import jdo.agreement.model.term.AgreementTerm;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.party.model.relationship.PartyRelationship;

@Generated(value="Dali", date="2014-12-02T21:59:11.036-0700")
@StaticMetamodel(Agreement.class)
public class Agreement_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Agreement, DateTimeRange> dateTimeRange;
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
