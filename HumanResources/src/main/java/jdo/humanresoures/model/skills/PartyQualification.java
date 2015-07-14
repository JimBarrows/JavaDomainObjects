package jdo.humanresoures.model.skills;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class PartyQualification extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Party.
	 * 
	 */
	private UUID heldBy;

	@ManyToOne
	private QualificationType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getHeldBy() {
		return heldBy;
	}

	public QualificationType getType() {
		return type;
	}

	public void setHeldBy(UUID heldBy) {
		this.heldBy = heldBy;
	}

	public void setType(QualificationType type) {
		this.type = type;
	}

}
