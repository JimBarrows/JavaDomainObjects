package jdo.workeffort.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.skills.SkillType;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-11T23:15:15.430-0700")
@StaticMetamodel(WorkEffortSkill.class)
public class WorkEffortSkill_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedCost;
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedDuration;
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedNumberOfPeople;
	public static volatile SingularAttribute<WorkEffortSkill, SkillType> skillType;
}
