package com.bizondemand.biz360.humanresoures_workeffort.workeffort.type;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.humanresoures.model.skills.SkillType;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class WorkEffortSkill extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int estimatedCost;
	
	private int estimatedDuration;
	
	private int estimatedNumberOfPeople;
	
	private SkillType skillType;

	public int getEstimatedCost() {
		return estimatedCost;
	}

	public int getEstimatedDuration() {
		return estimatedDuration;
	}

	public int getEstimatedNumberOfPeople() {
		return estimatedNumberOfPeople;
	}

	@ManyToOne
	public SkillType getSkillType() {
		return skillType;
	}

	public void setEstimatedCost(int estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public void setEstimatedDuration(int estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	public void setEstimatedNumberOfPeople(int estimatedNumberOfPeople) {
		this.estimatedNumberOfPeople = estimatedNumberOfPeople;
	}

	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}
}
