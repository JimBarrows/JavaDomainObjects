package jdo.humanresoures.model.application;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.humanresoures.model.position.Position;
import jdo.model.BasePersistentModel;

@Entity
public class EmploymentApplication extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date applicationDate;

	@ManyToOne
	private Position forPosition;

	/**
	 * UUID of Person.
	 * 
	 */
	private UUID fromPerson;

	/**
	 * UUID of Person.
	 * 
	 */
	private UUID referredBy;

	@ManyToOne
	private EmploymnetApplicationSourceType source;

	@ManyToOne
	private EmploymentApplicationStatusType status;

	public Date getApplicationDate() {
		return applicationDate;
	}

	public Position getForPosition() {
		return forPosition;
	}

	public UUID getFromPerson() {
		return fromPerson;
	}

	public UUID getReferredBy() {
		return referredBy;
	}

	public EmploymnetApplicationSourceType getSource() {
		return source;
	}

	public EmploymentApplicationStatusType getStatus() {
		return status;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public void setForPosition(Position forPosition) {
		this.forPosition = forPosition;
	}

	public void setFromPerson(UUID fromPerson) {
		this.fromPerson = fromPerson;
	}

	public void setReferredBy(UUID referredBy) {
		this.referredBy = referredBy;
	}

	public void setSource(EmploymnetApplicationSourceType source) {
		this.source = source;
	}

	public void setStatus(EmploymentApplicationStatusType status) {
		this.status = status;
	}

}
