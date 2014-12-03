package jdo.humanresoures.model.position.type;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class PositionTypeClass extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	private PositionType				forPositionType;

	private int							standardHoursePerWeek;

	private PositionClassificationType	type;

	private DateTimeRange				dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public PositionType getForPositionType() {
		return forPositionType;
	}

	@Max(40)
	public int getStandardHoursePerWeek() {
		return standardHoursePerWeek;
	}

	@ManyToOne
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
