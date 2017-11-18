package jdo.budget.model.revision;

import jdo.budget.model.Budget;
import jdo.model.BasePersistentModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class BudgetRevision extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@OneToMany
	private List<BudgetRevisionImpact>	affecting;

	private Date						revisedOn;

	@ManyToOne
	private Budget						revisionFor;

	private long						sequence;

	
	public List<BudgetRevisionImpact> getAffecting() {
		return affecting;
	}

	public Date getRevisedOn() {
		return revisedOn;
	}
	
	public Budget getRevisionFor() {
		return revisionFor;
	}

	public long getSequence() {
		return sequence;
	}

	public void setAffecting(List<BudgetRevisionImpact> affecting) {
		this.affecting = affecting;
	}

	public void setRevisedOn(Date revisedOn) {
		this.revisedOn = revisedOn;
	}

	public void setRevisionFor(Budget revisionFor) {
		this.revisionFor = revisionFor;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

}
