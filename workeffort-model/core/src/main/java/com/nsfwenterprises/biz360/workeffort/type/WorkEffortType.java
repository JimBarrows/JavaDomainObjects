package com.nsfwenterprises.biz360.workeffort.type;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.AssertTrue;

import com.nsfwenterprises.biz360.model.BaseType;
import com.nsfwenterprises.biz360.product.model.Product;
import com.nsfwenterprises.biz360.workeffort.requirement.DeliverableType;

@Entity
public class WorkEffortType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<WorkEffortType> breaksDownInto;
	
	private List<WorkEffortType> dependsOn;
	
	private List<WorkEffortGoodStandard> goodStandardNeeds;
	
	private List<WorkEffortSkill> skillNeeds;
	
	private int standardWorkHours;
	
	private DeliverableType usedToProduceDeliverable;
	
	private Product usedToProduceProduct;
	
	@OneToMany
	public List<WorkEffortType> getBreaksDownInto() {
		return breaksDownInto;
	}

	@OneToMany
	public List<WorkEffortType> getDependsOn() {
		return dependsOn;
	}

	@OneToMany
	public List<WorkEffortGoodStandard> getGoodStandardNeeds() {
		return goodStandardNeeds;
	}

	@OneToMany
	public List<WorkEffortSkill> getSkillNeeds() {
		return skillNeeds;
	}

	public int getStandardWorkHours() {
		return standardWorkHours;
	}

	@ManyToOne
	public DeliverableType getUsedToProduceDeliverable() {
		return usedToProduceDeliverable;
	}

	@ManyToOne
	public Product getUsedToProduceProduct() {
		return usedToProduceProduct;
	}

	@AssertTrue
	public boolean producesOnlyOneThing() {
		return (usedToProduceDeliverable != null) ^ (usedToProduceProduct != null);
	}

	public void setBreaksDownInto(List<WorkEffortType> breaksDownInto) {
		this.breaksDownInto = breaksDownInto;
	}

	public void setDependsOn(List<WorkEffortType> dependsOn) {
		this.dependsOn = dependsOn;
	}

	public void setGoodStandardNeeds(List<WorkEffortGoodStandard> goodStandardNeeds) {
		this.goodStandardNeeds = goodStandardNeeds;
	}

	public void setSkillNeeds(List<WorkEffortSkill> skillNeeds) {
		this.skillNeeds = skillNeeds;
	}

	public void setStandardWorkHours(int standardWorkHours) {
		this.standardWorkHours = standardWorkHours;
	}

	public void setUsedToProduceDeliverable(DeliverableType usedToProduceDeliverable) {
		this.usedToProduceDeliverable = usedToProduceDeliverable;
	}

	public void setUsedToProduceProduct(Product usedToProduceProduct) {
		this.usedToProduceProduct = usedToProduceProduct;
	}
}
