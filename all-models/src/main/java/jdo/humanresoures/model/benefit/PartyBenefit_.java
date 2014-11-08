package jdo.humanresoures.model.benefit;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.relationship.Employment;

@Generated(value="Dali", date="2014-11-07T22:13:42.257-0700")
@StaticMetamodel(PartyBenefit.class)
public class PartyBenefit_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyBenefit, Employment> benefitFor;
	public static volatile SingularAttribute<PartyBenefit, BenefitType> type;
	public static volatile SingularAttribute<PartyBenefit, Integer> actualEmployerPaidPercent;
	public static volatile SingularAttribute<PartyBenefit, Integer> availableTime;
	public static volatile SingularAttribute<PartyBenefit, BigDecimal> cost;
	public static volatile SingularAttribute<PartyBenefit, PeriodType> period;
}
