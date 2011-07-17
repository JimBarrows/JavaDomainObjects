package mbmp.accounting_order.accounting;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import mbmp.order.model.OrderItem;

@Entity
public class BudgetItem extends mbmp.budget.model.BudgetItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<OrderItem> usedToBuy;

    private List<mbmp.accounting_order.budget.model.allocation.RequirementBudgetAllocation> providesFundingVia;

    public List<mbmp.accounting_order.budget.model.allocation.RequirementBudgetAllocation> getProvidesFundingVia() {
        return providesFundingVia;
    }

    public void setProvidesFundingVia(List<mbmp.accounting_order.budget.model.allocation.RequirementBudgetAllocation> providesFundingVia) {
        this.providesFundingVia = providesFundingVia;
    }

    @OneToMany
	public List<OrderItem> getUsedToBuy() {
		return usedToBuy;
	}


	public void setUsedToBuy(List<OrderItem> usedToBuy) {
		this.usedToBuy = usedToBuy;
	}


}
