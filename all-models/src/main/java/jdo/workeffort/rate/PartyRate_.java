package jdo.workeffort.rate;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:43.663-0700")
@StaticMetamodel(PartyRate.class)
public class PartyRate_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyRate, Party> rateFor;
	public static volatile SingularAttribute<PartyRate, RateType> rateType;
	public static volatile SingularAttribute<PartyRate, BigDecimal> rate;
}
