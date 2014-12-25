package jdo.humanresoures.model.position.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.ValidResponsibility;
import jdo.humanresoures.model.position.salary.PositionTypeRate;
import jdo.model.BasePersistentModel_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-12-24T17:30:46.526-0700")
@StaticMetamodel(PositionType.class)
public class PositionType_ extends BasePersistentModel_ {
	public static volatile ListAttribute<PositionType, PositionTypeRate> rates;
	public static volatile ListAttribute<PositionType, PositionTypeClass> typeClasses;
	public static volatile SingularAttribute<PositionType, PartyRole> union;
	public static volatile ListAttribute<PositionType, ValidResponsibility> validResponsibilities;
	public static volatile SingularAttribute<PositionType, Integer> benefitPercent;
	public static volatile SingularAttribute<PositionType, String> title;
}
