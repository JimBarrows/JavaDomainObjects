package jdo.party.model.communication;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:27 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.12, page 60"
 */
@SuppressWarnings("serial")
@Entity
public class CommunicationEventRole extends BasePersistentModel {

	private CommunicationEventRoleType describedBy;
	
	private Party forParty;
	
	private CommunicationEvent of;

	private CommunicationEventRoleType type;

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof CommunicationEventRole)) {
			return false;
		}
		CommunicationEventRole rhs = (CommunicationEventRole) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.of, rhs.of).append(this.describedBy, rhs.describedBy)
				.append(this.forParty, rhs.forParty).isEquals();
	}

	/**
	 * @return the describedBy
	 */
	@ManyToOne
	public CommunicationEventRoleType getDescribedBy() {
		return describedBy;
	}

	/**
	 * @return the forParty
	 */
	@ManyToOne
	public Party getForParty() {
		return forParty;
	}

	/**
	 * @return the of
	 */
	@ManyToOne
	@JoinColumn(name="communicationEventOf")
	public CommunicationEvent getOf() {
		return of;
	}

	@NotNull
	@ManyToOne
	public CommunicationEventRoleType getType() {
		return type;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-2037152775, -1282799171).appendSuper(
				super.hashCode()).append(this.of).append(this.describedBy)
				.append(this.forParty).toHashCode();
	}

	/**
	 * @param describedBy
	 *            the describedBy to set
	 */
	public void setDescribedBy(CommunicationEventRoleType describedBy) {
		this.describedBy = describedBy;
	}

	/**
	 * @param forParty
	 *            the forParty to set
	 */
	public void setForParty(Party forParty) {
		this.forParty = forParty;
	}

	/**
	 * @param of
	 *            the of to set
	 */
	public void setOf(CommunicationEvent of) {
		this.of = of;
	}

	public void setType(CommunicationEventRoleType type) {
		this.type = type;
	}

}