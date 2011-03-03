package com.nsfwenterprises.biz360.party.model.communication;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.Party;

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
	
	private CaseRoleType describedBy;

	private Party of;

	private Case roleFor;

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof CaseRole)) {
			return false;
		}
		CaseRole rhs = (CaseRole) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.of, rhs.of).append(this.describedBy, rhs.describedBy)
				.append(this.roleFor, rhs.roleFor).isEquals();
	}

	/**
	 * @return the describedBy
	 */
	@ManyToOne
	@NotNull
	public CaseRoleType getDescribedBy() {
		return describedBy;
	}

	/**
	 * @return the of
	 */
	@ManyToOne
	@JoinColumn(name="ofParty")
	public Party getOf() {
		return of;
	}

	/**
	 * @return the roleFor
	 */
	@ManyToOne
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