package mbmp.humanresoures.model.position.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.ValidResponsibility;
import mbmp.humanresoures.model.position.salary.PositionTypeRate;
import mbmp.model.BaseType_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-04T22:11:20.441-0700")
@StaticMetamodel(PositionType.class)
public class PositionType_ extends BaseType_ {
	public static volatile SingularAttribute<PositionType, Integer> benefitPercent;
	public static volatile ListAttribute<PositionType, PositionTypeRate> rates;
	public static volatile SingularAttribute<PositionType, String> title;
	public static volatile ListAttribute<PositionType, PositionTypeClass> typeClasses;
	public static volatile SingularAttribute<PositionType, PartyRole> union;
	public static volatile ListAttribute<PositionType, ValidResponsibility> validResponsibilities;
}
