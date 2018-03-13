package jdo.humanresoures.model.skills;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class PartyQualification extends PersistentEntity {

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
