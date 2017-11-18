package jdo.humanresoures.model.position.type;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PositionTypeClass extends PersistentEntity {

	/**
	 * 
	 */
	private static final long						serialVersionUID	= 1L;

	@ManyToOne
	private PositionType								forPositionType;

	private int													standardHoursePerWeek;

	@ManyToOne
	private PositionClassificationType	type;

	@Embedded
	private DateTimeRange								dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PositionType getForPositionType() {
		return forPositionType;
	}

	public int getStandardHoursePerWeek() {
		return standardHoursePerWeek;
	}

	public PositionClassificationType getType() {
		return type;
	}

	public void setForPositionType(PositionType forPositionType) {
		this.forPositionType = forPositionType;
	}

	public void setStandardHoursePerWeek(int standardHoursePerWeek) {
		this.standardHoursePerWeek = standardHoursePerWeek;
	}

	public void setType(PositionClassificationType type) {
		this.type = type;
	}

}
