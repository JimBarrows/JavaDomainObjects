package mbmp.humanresoures.model.application;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.humanresoures.model.position.Position;
import mbmp.model.BasePersistentModel;
import mbmp.party.model.Person;

@Entity
public class EmploymentApplication extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date applicationDate;
	
	private Position forPosition;
	
	private Person fromPerson;
	
	private Person referredBy;
	
	private EmploymnetApplicationSourceType source;
	
	private EmploymentApplicationStatusType status;

	public Date getApplicationDate() {
		return applicationDate;
	}

	@ManyToOne
	public Position getForPosition() {
		return forPosition;
	}

	public Person getFromPerson() {
		return fromPerson;
	}

	public Person getReferredBy() {
		return referredBy;
	}

	@ManyToOne
	public EmploymnetApplicationSourceType getSource() {
		return source;
	}

	@ManyToOne
	public EmploymentApplicationStatusType getStatus() {
		return status;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public void setForPosition(Position forPosition) {
		this.forPosition = forPosition;
	}

	public void setFromPerson(Person fromPerson) {
		this.fromPerson = fromPerson;
	}

	public void setReferredBy(Person referredBy) {
		this.referredBy = referredBy;
	}

	public void setSource(EmploymnetApplicationSourceType source) {
		this.source = source;
	}

	public void setStatus(EmploymentApplicationStatusType status) {
		this.status = status;
	}

}
