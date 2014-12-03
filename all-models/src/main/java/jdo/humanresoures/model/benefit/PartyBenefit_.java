package jdo.humanresoures.model.benefit;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.relationship.Employment;

@Generated(value="Dali", date="2014-12-02T21:59:11.175-0700")
@StaticMetamodel(PartyBenefit.class)
public class PartyBenefit_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyBenefit, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyBenefit, Employment> benefitFor;
	public static volatile SingularAttribute<PartyBenefit, Money> cost;
	public static volatile SingularAttribute<PartyBenefit, BenefitType> type;
	public static volatile SingularAttribute<PartyBenefit, Integer> actualEmployerPaidPercent;
	public static volatile SingularAttribute<PartyBenefit, Integer> availableTime;
	public static volatile SingularAttribute<PartyBenefit, PeriodType> period;
}
