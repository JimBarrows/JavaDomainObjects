package mbmp.party.model.communication;

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

import mbmp.model.BasePersistentModel;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

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

	private String description;

	private List<CommunicationEvent> encompassing = new ArrayList<CommunicationEvent>();
	
	private CaseStatusType inTheStateOf;

	/**
	 * Party(s) responsible for the Case.
	 * 
	 */	
	private List<CaseRole> involving = new ArrayList<CaseRole>();
	
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
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof Case)) {
			return false;
		}
		Case rhs = (Case) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.start, rhs.start)
				.append(this.description, rhs.description).append(
						this.involving, rhs.involving).append(
						this.inTheStateOf, rhs.inTheStateOf).append(
						this.encompassing, rhs.encompassing).isEquals();
	}

	/**
	 * @return the description
	 */
	@NotEmpty
	@Lob
	public String getDescription() {
		return description;
	}

	/**
	 * @return the encompassing
	 */
	@ManyToMany(mappedBy = "asPartOf")
	public List<CommunicationEvent> getEncompassing() {
		return encompassing;
	}

	/**
	 * @return the inTheStateOf
	 */
	@ManyToOne
	public CaseStatusType getInTheStateOf() {
		return inTheStateOf;
	}

	/**
	 * @return the involving
	 */
	@OneToMany(mappedBy = "roleFor", cascade = CascadeType.ALL)
	public List<CaseRole> getInvolving() {
		return involving;
	}

	/**
	 * @return the start
	 */
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStart() {
		return start;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-1330069149, 407741471).appendSuper(
				super.hashCode()).append(this.start).append(this.description)
				.append(this.involving).append(this.inTheStateOf).append(
						this.encompassing).toHashCode();
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