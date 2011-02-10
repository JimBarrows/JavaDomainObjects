package com.nsfwenterprises.biz360.party.model.communication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.AssertTrue;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.PartyContactMechanism;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

/**
 * Represents a communication between two or more parties.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:27 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.7, Page 48"
 * @see "Data Model Resource Book Volume 1 Figure 2.12, page 60"
 * @see "Data Model Resource Book Volume 1 Figure 2.13, page 64"
 */
@SuppressWarnings("serial")
@Entity
public class CommunicationEvent extends BasePersistentModel {

	private List<Case> asPartOf = new ArrayList<Case>();

	private List<CommunicationEventPurpose> categorizedBy = new ArrayList<CommunicationEventPurpose>();

	private Date dateTimeEnded;

	private Date dateTimeStarted;

	private PartyRelationship inTheContextOf;

	private List<CommunicationEventRole> involving = new ArrayList<CommunicationEventRole>();

	private CommunicationEventStatusType monitoredBy;

	private String note;

	private PartyContactMechanism occursVia;

	public void addCommunicationEventRole(
			CommunicationEventRole communicationEventRole) {
		if (!getInvolving().contains(communicationEventRole)) {
			getInvolving().add(communicationEventRole);
			communicationEventRole.setOf(this);
		}

	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof CommunicationEvent)) {
			return false;
		}
		CommunicationEvent rhs = (CommunicationEvent) object;
		return new EqualsBuilder().append(this.dateTimeStarted,
				rhs.dateTimeStarted).append(this.occursVia, rhs.occursVia)
				.append(this.dateTimeEnded, rhs.dateTimeEnded).isEquals();
	}

	/**
	 * @return the asPartOf
	 */
	@ManyToMany
	public List<Case> getAsPartOf() {
		return asPartOf;
	}

	/**
	 * @return the categorizedBy
	 */
	@OneToMany
	public List<CommunicationEventPurpose> getCategorizedBy() {
		return categorizedBy;
	}

	/**
	 * @return the dateTimeEnded
	 */
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateTimeEnded() {
		return dateTimeEnded;
	}

	/**
	 * @return the dateTimeStarted
	 */
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateTimeStarted() {
		return dateTimeStarted;
	}

	/**
	 * @return the inTheContextOf
	 */
	@ManyToOne
	public PartyRelationship getInTheContextOf() {
		return inTheContextOf;
	}

	/**
	 * @return the involving
	 */
	@OneToMany(mappedBy = "of", cascade = CascadeType.ALL)
	public List<CommunicationEventRole> getInvolving() {
		return involving;
	}

	/**
	 * @return the monitoredBy
	 */
	@ManyToOne
	public CommunicationEventStatusType getMonitoredBy() {
		return monitoredBy;
	}

	/**
	 * @return the note
	 */
	@NotEmpty
	@Lob
	public String getNote() {
		return note;
	}

	/**
	 * @return the occursVia
	 */
	@ManyToOne
	public PartyContactMechanism getOccursVia() {
		return occursVia;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-837481293, 1211293983).append(
				this.dateTimeStarted).append(this.occursVia).append(
				this.dateTimeEnded).toHashCode();
	}

	@AssertTrue
	public boolean dateRangeIsValid() {
		if (dateTimeEnded != null) {
			return true;
		} else {
			return dateTimeEnded.after(dateTimeStarted);
		}
	}

	/**
	 * @param asPartOf
	 *            the asPartOf to set
	 */
	public void setAsPartOf(List<Case> asPartOf) {
		this.asPartOf = asPartOf;
	}

	/**
	 * @param categorizedBy
	 *            the categorizedBy to set
	 */
	public void setCategorizedBy(List<CommunicationEventPurpose> categorizedBy) {
		this.categorizedBy = categorizedBy;
	}

	/**
	 * @param dateTimeEnded
	 *            the dateTimeEnded to set
	 */
	public void setDateTimeEnded(Date dateTimeEnded) {
		this.dateTimeEnded = dateTimeEnded;
	}

	/**
	 * @param dateTimeStarted
	 *            the dateTimeStarted to set
	 */
	public void setDateTimeStarted(Date dateTimeStarted) {
		this.dateTimeStarted = dateTimeStarted;
	}

	/**
	 * @param inTheContextOf
	 *            the inTheContextOf to set
	 */
	public void setInTheContextOf(PartyRelationship inTheContextOf) {
		this.inTheContextOf = inTheContextOf;
	}

	/**
	 * @param involving
	 *            the involving to set
	 */
	public void setInvolving(List<CommunicationEventRole> involving) {
		this.involving = involving;
	}

	/**
	 * @param monitoredBy
	 *            the monitoredBy to set
	 */
	public void setMonitoredBy(CommunicationEventStatusType monitoredBy) {
		this.monitoredBy = monitoredBy;
	}

//	public void addCase(Case newCase) {
//		getAsPartOf().add(newCase);
//		newCase.getEncompassing().add(this);
//	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @param occursVia
	 *            the occursVia to set
	 */
	public void setOccursVia(PartyContactMechanism occursVia) {
		this.occursVia = occursVia;
	}
}