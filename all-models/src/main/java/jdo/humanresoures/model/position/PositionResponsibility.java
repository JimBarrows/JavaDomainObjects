package jdo.humanresoures.model.position;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class PositionResponsibility extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Position			associatedWith;

	private String				comment;

	private ResponsibilityType	type;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public Position getAssociatedWith() {
		return associatedWith;
	}

	public String getComment() {
		return comment;
	}

	@ManyToOne
	public ResponsibilityType getType() {
		return type;
	}

	public void setAssociatedWith(Position associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setType(ResponsibilityType type) {
		this.type = type;
	}

}
