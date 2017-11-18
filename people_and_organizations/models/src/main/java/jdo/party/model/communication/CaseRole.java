package jdo.party.model.communication;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * This class associates a party, and the role they are playing in a case.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:26 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.13, page 64"
 */
@SuppressWarnings("serial")
@Entity
public class CaseRole extends BasePersistentModel {
	
	@ManyToOne
	@NotNull
	private CaseRoleType describedBy;

	@ManyToOne
	@JoinColumn(name="ofParty")
	private Party of;

	@ManyToOne
	private Case roleFor;

	

	/**
	 * @return the describedBy
	 */
	
	public CaseRoleType getDescribedBy() {
		return describedBy;
	}

	/**
	 * @return the of
	 */
	
	public Party getOf() {
		return of;
	}

	/**
	 * @return the roleFor
	 */
	
	public Case getRoleFor() {
		return roleFor;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1031082169, -1243899859).appendSuper(
				super.hashCode()).append(this.of).append(this.describedBy)
				.append(this.roleFor).toHashCode();
	}

	/**
	 * @param describedBy
	 *            the describedBy to set
	 */
	public void setDescribedBy(CaseRoleType describedBy) {
		this.describedBy = describedBy;
	}

	/**
	 * @param of
	 *            the of to set
	 */
	public void setOf(Party of) {
		this.of = of;
	}

	/**
	 * @param roleFor
	 *            the roleFor to set
	 */
	public void setRoleFor(Case roleFor) {
		this.roleFor = roleFor;
	}

}