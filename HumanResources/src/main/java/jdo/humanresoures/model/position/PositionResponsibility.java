package jdo.humanresoures.model.position;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PositionResponsibility extends PersistentEntity {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@ManyToOne
	private Position						associatedWith;

	private String							comment;

	@ManyToOne
	private ResponsibilityType	type;

	@Embedded
	private DateTimeRange				dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Position getAssociatedWith() {
		return associatedWith;
	}

	public String getComment() {
		return comment;
	}

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
