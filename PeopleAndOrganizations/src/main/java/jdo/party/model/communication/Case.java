package jdo.party.model.communication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;

import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A Case may be set up for a series of related communication events, regarding
 * a particular issue. Renamed the table to Kase to avoid a SQL keyword conflict
 * with Case.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:26 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.13, page 64"
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "Kase")
public class Case extends BasePersistentModel {

	@Lob
	private String description;

	@ManyToMany(mappedBy = "asPartOf")
	private List<CommunicationEvent> encompassing = new ArrayList<CommunicationEvent>();

	@ManyToOne
	private CaseStatusType inTheStateOf;

	/**
	 * Party(s) responsible for the Case.
	 * 
	 */
	@OneToMany(mappedBy = "roleFor", cascade = CascadeType.ALL)
	private List<CaseRole> involving = new ArrayList<CaseRole>();

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date start;

	public void addCaseRole(CaseRole caseRole) {
		getInvolving().add(caseRole);
		caseRole.setRoleFor(this);

	}

	public void addCommunicationEvent(CommunicationEvent communicationEvent) {
		getEncompassing().add(communicationEvent);
		communicationEvent.getAsPartOf().add(this);
	}

	/**
	 * @return the description
	 */

	public String getDescription() {
		return description;
	}

	/**
	 * @return the encompassing
	 */

	public List<CommunicationEvent> getEncompassing() {
		return encompassing;
	}

	/**
	 * @return the inTheStateOf
	 */

	public CaseStatusType getInTheStateOf() {
		return inTheStateOf;
	}

	/**
	 * @return the involving
	 */

	public List<CaseRole> getInvolving() {
		return involving;
	}

	/**
	 * @return the start
	 */

	public Date getStart() {
		return start;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-1330069149, 407741471)
				.appendSuper(super.hashCode()).append(this.start)
				.append(this.description).append(this.involving)
				.append(this.inTheStateOf).append(this.encompassing)
				.toHashCode();
	}

	public void removeCaseRole(CaseRole caseRole) {
		getInvolving().remove(caseRole);
		caseRole.setRoleFor(null);

	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param encompassing
	 *            the encompassing to set
	 */
	public void setEncompassing(List<CommunicationEvent> encompassing) {
		this.encompassing = encompassing;
	}

	/**
	 * @param inTheStateOf
	 *            the inTheStateOf to set
	 */
	public void setInTheStateOf(CaseStatusType inTheStateOf) {
		this.inTheStateOf = inTheStateOf;
	}

	/**
	 * @param involving
	 *            the involving to set
	 */
	public void setInvolving(List<CaseRole> involving) {
		this.involving = involving;
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

}