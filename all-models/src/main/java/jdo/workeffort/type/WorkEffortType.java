package jdo.workeffort.type;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertTrue;

import jdo.model.BaseType;
import jdo.product.model.Product;
import jdo.workeffort.requirement.DeliverableType;

@Entity
public class WorkEffortType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany
	private List<WorkEffortType> breaksDownInto;
	@OneToMany
	private List<WorkEffortType> dependsOn;
	@OneToMany
	private List<WorkEffortGoodStandard> goodStandardNeeds;

	private int standardWorkHours;
	@ManyToOne
	private DeliverableType usedToProduceDeliverable;
	@ManyToOne
	private Product usedToProduceProduct;

	public List<WorkEffortType> getBreaksDownInto() {
		return breaksDownInto;
	}

	public List<WorkEffortType> getDependsOn() {
		return dependsOn;
	}

	public List<WorkEffortGoodStandard> getGoodStandardNeeds() {
		return goodStandardNeeds;
	}

	public int getStandardWorkHours() {
		return standardWorkHours;
	}

	public DeliverableType getUsedToProduceDeliverable() {
		return usedToProduceDeliverable;
	}

	public Product getUsedToProduceProduct() {
		return usedToProduceProduct;
	}

	@AssertTrue
	public boolean producesOnlyOneThing() {
		return (usedToProduceDeliverable != null)
				^ (usedToProduceProduct != null);
	}

	public void setBreaksDownInto(List<WorkEffortType> breaksDownInto) {
		this.breaksDownInto = breaksDownInto;
	}

	public void setDependsOn(List<WorkEffortType> dependsOn) {
		this.dependsOn = dependsOn;
	}

	public void setGoodStandardNeeds(
			List<WorkEffortGoodStandard> goodStandardNeeds) {
		this.goodStandardNeeds = goodStandardNeeds;
	}

	public void setStandardWorkHours(int standardWorkHours) {
		this.standardWorkHours = standardWorkHours;
	}

	public void setUsedToProduceDeliverable(
			DeliverableType usedToProduceDeliverable) {
		this.usedToProduceDeliverable = usedToProduceDeliverable;
	}

	public void setUsedToProduceProduct(Product usedToProduceProduct) {
		this.usedToProduceProduct = usedToProduceProduct;
	}
}
