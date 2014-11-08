package jdo.humanresoures.model.skills;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class PartySkill extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party heldBy;
	
	private int skillLevel;
	
	private Date startedUsing;
	
	private SkillType type;
	
	private int yearsOfExperience;

	public Party getHeldBy() {
		return heldBy;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public Date getStartedUsing() {
		return startedUsing;
	}

	@ManyToOne
	public SkillType getType() {
		return type;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setHeldBy(Party heldBy) {
		this.heldBy = heldBy;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public void setStartedUsing(Date startedUsing) {
		this.startedUsing = startedUsing;
	}

	public void setType(SkillType type) {
		this.type = type;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

}
