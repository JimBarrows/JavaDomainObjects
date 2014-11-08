package mbmp.workeffort.rate;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.salary.RateType;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2014-11-07T06:11:39.820-0700")
@StaticMetamodel(PartyRate.class)
public class PartyRate_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyRate, Party> rateFor;
	public static volatile SingularAttribute<PartyRate, RateType> rateType;
	public static volatile SingularAttribute<PartyRate, BigDecimal> rate;
}
