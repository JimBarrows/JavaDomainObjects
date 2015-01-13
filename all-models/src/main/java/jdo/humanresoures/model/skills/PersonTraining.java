package jdo.humanresoures.model.skills;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Person;

@Entity
public class PersonTraining extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Person						receivedBy;

	@ManyToOne
	private TrainingClassType	type;

	@Embedded
	private DateTimeRange			dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Person getReceivedBy() {
		return receivedBy;
	}

	public TrainingClassType getType() {
		return type;
	}

	public void setReceivedBy(Person receivedBy) {
		this.receivedBy = receivedBy;
	}

	public void setType(TrainingClassType type) {
		this.type = type;
	}

}
