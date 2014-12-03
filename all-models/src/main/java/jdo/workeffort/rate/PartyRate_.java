package jdo.workeffort.rate;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-02T21:13:59.057-0700")
@StaticMetamodel(PartyRate.class)
public class PartyRate_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyRate, Party> rateFor;
	public static volatile SingularAttribute<PartyRate, RateType> rateType;
	public static volatile SingularAttribute<PartyRate, BigDecimal> rate;
	public static volatile SingularAttribute<PartyRate, DateTimeRange> dateTimeRange;
}
