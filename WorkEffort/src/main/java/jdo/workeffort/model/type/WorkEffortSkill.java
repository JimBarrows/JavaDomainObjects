package jdo.workeffort.model.type;

import java.time.Duration;
import java.util.UUID;

import javax.persistence.Entity;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
public class WorkEffortSkill extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Money estimatedCost;

	private Duration estimatedDuration;

	private int estimatedNumberOfPeople;

	/**
	 * UUID of SkillType.
	 * 
	 */
	private UUID skillType;

	public int getEstimatedNumberOfPeople() {
		return estimatedNumberOfPeople;
	}

	public UUID getSkillType() {
		return skillType;
	}

	public void setEstimatedNumberOfPeople(int estimatedNumberOfPeople) {
		this.estimatedNumberOfPeople = estimatedNumberOfPeople;
	}

	public Money getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(Money estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public Duration getEstimatedDuration() {
		return estimatedDuration;
	}

	public void setEstimatedDuration(Duration estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	public void setSkillType(UUID skillType) {
		this.skillType = skillType;
	}
}
