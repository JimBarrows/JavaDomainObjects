package jdo.humanresoures.model.skills;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.UUID;

@Entity
public class PartySkill extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Party.
	 * 
	 */
	private UUID heldBy;

	@Min(0)
	private int skillLevel;

	@Temporal(TemporalType.DATE)
	private Date startedUsing;

	@ManyToOne
	private SkillType type;

	@Min(0)
	private int yearsOfExperience;

	public UUID getHeldBy() {
		return heldBy;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public Date getStartedUsing() {
		return startedUsing;
	}

	public SkillType getType() {
		return type;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setHeldBy(UUID heldBy) {
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
