package mbmp.humanresoures.model.termination;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.relationship.Employment;

@Generated(value="Dali", date="2013-01-04T22:11:20.462-0700")
@StaticMetamodel(UnemploymentClaim.class)
public class UnemploymentClaim_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<UnemploymentClaim, Date> claimDate;
	public static volatile SingularAttribute<UnemploymentClaim, String> description;
	public static volatile SingularAttribute<UnemploymentClaim, Employment> resultingFrom;
	public static volatile SingularAttribute<UnemploymentClaim, UnemploymentClaimStatusType> status;
}
