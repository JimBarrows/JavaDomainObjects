package mbmp.budget.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;

@Entity
public class BudgetRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party forParty;
	
	private BudgetRoleType type;

	public Party getForParty() {
		return forParty;
	}

	@ManyToOne
	public BudgetRoleType getType() {
		return type;
	}

	public void setForParty(Party forParty) {
		this.forParty = forParty;
	}

	public void setType(BudgetRoleType type) {
		this.type = type;
	}

}
