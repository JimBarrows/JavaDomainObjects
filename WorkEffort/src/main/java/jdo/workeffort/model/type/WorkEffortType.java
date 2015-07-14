package jdo.workeffort.model.type;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertTrue;

import jdo.model.BaseType;
import jdo.workeffort.model.requirement.DeliverableType;

@Entity
public class WorkEffortType extends BaseType {
	
	private static final long serialVersionUID = 1L;
	@OneToMany
	private List<WorkEffortType> breaksDownInto;
	@OneToMany
	private List<WorkEffortType> dependsOn;
	@OneToMany
	private List<WorkEffortGoodStandard> goodStandardNeeds;

	private Duration standardWorkHours;
	
	@ManyToOne
	private DeliverableType usedToProduceDeliverable;
	
	/**UUID of the Product.
	 * 
	 */
	private UUID usedToProduceProduct;

	public List<WorkEffortType> getBreaksDownInto() {
		return breaksDownInto;
	}

	public List<WorkEffortType> getDependsOn() {
		return dependsOn;
	}

	public List<WorkEffortGoodStandard> getGoodStandardNeeds() {
		return goodStandardNeeds;
	}

	public Duration getStandardWorkHours() {
		return standardWorkHours;
	}

	public DeliverableType getUsedToProduceDeliverable() {
		return usedToProduceDeliverable;
	}

	public UUID getUsedToProduceProduct() {
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

	public void setStandardWorkHours(Duration standardWorkHours) {
		this.standardWorkHours = standardWorkHours;
	}

	public void setUsedToProduceDeliverable(
			DeliverableType usedToProduceDeliverable) {
		this.usedToProduceDeliverable = usedToProduceDeliverable;
	}

	public void setUsedToProduceProduct(UUID usedToProduceProduct) {
		this.usedToProduceProduct = usedToProduceProduct;
	}
}
