package jdo.party.model.communication;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:27 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.12, page 60"
 */
@SuppressWarnings("serial")
@Entity
public class CommunicationEventRole extends BasePersistentModel {

	@ManyToOne
	private CommunicationEventRoleType describedBy;
	
	@ManyToOne
	private Party forParty;
	
	@ManyToOne
	@JoinColumn(name="communicationEventOf")
	private CommunicationEvent of;

	@NotNull
	@ManyToOne
	private CommunicationEventRoleType type;

	

	/**
	 * @return the describedBy
	 */
	
	public CommunicationEventRoleType getDescribedBy() {
		return describedBy;
	}

	/**
	 * @return the forParty
	 */
	
	public Party getForParty() {
		return forParty;
	}

	/**
	 * @return the of
	 */
	
	public CommunicationEvent getOf() {
		return of;
	}

	
	public CommunicationEventRoleType getType() {
		return type;
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