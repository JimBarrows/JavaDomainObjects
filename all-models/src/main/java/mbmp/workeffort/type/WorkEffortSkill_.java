package mbmp.workeffort.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.skills.SkillType;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:23.689-0700")
@StaticMetamodel(WorkEffortSkill.class)
public class WorkEffortSkill_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedCost;
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedDuration;
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedNumberOfPeople;
	public static volatile SingularAttribute<WorkEffortSkill, SkillType> skillType;
}
