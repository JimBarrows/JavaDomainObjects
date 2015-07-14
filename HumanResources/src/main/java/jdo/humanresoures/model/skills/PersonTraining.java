package jdo.humanresoures.model.skills;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
public class PersonTraining extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Person.
	 * 
	 */
	private UUID receivedBy;

	@ManyToOne
	private TrainingClassType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getReceivedBy() {
		return receivedBy;
	}

	public TrainingClassType getType() {
		return type;
	}

	public void setReceivedBy(UUID receivedBy) {
		this.receivedBy = receivedBy;
	}

	public void setType(TrainingClassType type) {
		this.type = type;
	}

}
