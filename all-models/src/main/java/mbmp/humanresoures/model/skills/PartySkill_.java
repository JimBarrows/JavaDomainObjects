package mbmp.humanresoures.model.skills;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2014-11-07T06:11:39.382-0700")
@StaticMetamodel(PartySkill.class)
public class PartySkill_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartySkill, SkillType> type;
	public static volatile SingularAttribute<PartySkill, Party> heldBy;
	public static volatile SingularAttribute<PartySkill, Integer> skillLevel;
	public static volatile SingularAttribute<PartySkill, Date> startedUsing;
	public static volatile SingularAttribute<PartySkill, Integer> yearsOfExperience;
}
