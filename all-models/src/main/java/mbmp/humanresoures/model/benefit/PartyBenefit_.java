package mbmp.humanresoures.model.benefit;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.asset.PeriodType;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.relationship.Employment;

@Generated(value="Dali", date="2014-11-07T06:11:38.769-0700")
@StaticMetamodel(PartyBenefit.class)
public class PartyBenefit_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyBenefit, Employment> benefitFor;
	public static volatile SingularAttribute<PartyBenefit, BenefitType> type;
	public static volatile SingularAttribute<PartyBenefit, Integer> actualEmployerPaidPercent;
	public static volatile SingularAttribute<PartyBenefit, Integer> availableTime;
	public static volatile SingularAttribute<PartyBenefit, BigDecimal> cost;
	public static volatile SingularAttribute<PartyBenefit, PeriodType> period;
}
