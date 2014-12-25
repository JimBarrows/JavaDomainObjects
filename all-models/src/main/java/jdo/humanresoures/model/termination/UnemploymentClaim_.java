package jdo.humanresoures.model.termination;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.relationship.Employment;

@Generated(value="Dali", date="2014-12-24T17:30:46.599-0700")
@StaticMetamodel(UnemploymentClaim.class)
public class UnemploymentClaim_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<UnemploymentClaim, Employment> resultingFrom;
	public static volatile SingularAttribute<UnemploymentClaim, UnemploymentClaimStatusType> status;
	public static volatile SingularAttribute<UnemploymentClaim, Date> claimDate;
	public static volatile SingularAttribute<UnemploymentClaim, String> description;
}
