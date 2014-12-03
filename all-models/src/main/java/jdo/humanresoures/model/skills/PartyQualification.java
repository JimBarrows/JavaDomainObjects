package jdo.humanresoures.model.skills;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class PartyQualification extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Party				heldBy;

	private QualificationType	type;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Party getHeldBy() {
		return heldBy;
	}

	@ManyToOne
	public QualificationType getType() {
		return type;
	}

	public void setHeldBy(Party heldBy) {
		this.heldBy = heldBy;
	}

	public void setType(QualificationType type) {
		this.type = type;
	}

}
