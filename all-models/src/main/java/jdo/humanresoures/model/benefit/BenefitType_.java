package jdo.humanresoures.model.benefit;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.250-0700")
@StaticMetamodel(BenefitType.class)
public class BenefitType_ extends BasePersistentModel_ {
	public static volatile ListAttribute<BenefitType, PartyBenefit> partyBenefits;
	public static volatile SingularAttribute<BenefitType, String> description;
	public static volatile SingularAttribute<BenefitType, Integer> employerPercentage;
	public static volatile SingularAttribute<BenefitType, String> name;
}
