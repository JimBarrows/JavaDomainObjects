package mbmp.budget.model;

import javax.persistence.Entity;
import java.math.BigDecimal;

import mbmp.model.BasePersistentModel;
import mbmp.requirement.model.Requirement;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 8:48:30 AM
 */
@Entity
public class RequirementBudgetAllocation extends BasePersistentModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BudgetItem allocatedTo;

    private Requirement allocationOf;

    private BigDecimal amount;

    public Requirement getAllocationOf() {
		return allocationOf;
	}

	public void setAllocationOf(Requirement allocationOf) {
		this.allocationOf = allocationOf;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BudgetItem getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(BudgetItem allocatedTo) {
        this.allocatedTo = allocatedTo;
    }
}
