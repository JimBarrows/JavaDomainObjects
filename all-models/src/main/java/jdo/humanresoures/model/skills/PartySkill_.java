package jdo.humanresoures.model.skills;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-31T07:44:54.037-0700")
@StaticMetamodel(PartySkill.class)
public class PartySkill_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartySkill, Party> heldBy;
	public static volatile SingularAttribute<PartySkill, Integer> skillLevel;
	public static volatile SingularAttribute<PartySkill, Date> startedUsing;
	public static volatile SingularAttribute<PartySkill, SkillType> type;
	public static volatile SingularAttribute<PartySkill, Integer> yearsOfExperience;
}
