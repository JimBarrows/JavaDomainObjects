package jdo.workeffort.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.skills.SkillType;

@Generated(value="Dali", date="2014-12-24T16:23:57.889-0700")
@StaticMetamodel(WorkEffortSkill.class)
public class WorkEffortSkill_ {
	public static volatile SingularAttribute<WorkEffortSkill, SkillType> skillType;
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedCost;
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedDuration;
	public static volatile SingularAttribute<WorkEffortSkill, Integer> estimatedNumberOfPeople;
}
