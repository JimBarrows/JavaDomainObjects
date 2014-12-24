package jdo.humanresoures.model.skills;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:55.599-0700")
@StaticMetamodel(PartySkill.class)
public class PartySkill_ {
	public static volatile SingularAttribute<PartySkill, SkillType> type;
	public static volatile SingularAttribute<PartySkill, Party> heldBy;
	public static volatile SingularAttribute<PartySkill, Integer> skillLevel;
	public static volatile SingularAttribute<PartySkill, Date> startedUsing;
	public static volatile SingularAttribute<PartySkill, Integer> yearsOfExperience;
}
