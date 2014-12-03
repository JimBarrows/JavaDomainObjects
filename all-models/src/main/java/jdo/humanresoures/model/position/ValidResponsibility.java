package jdo.humanresoures.model.position;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class ValidResponsibility extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private PositionType		associatedWith;

	private String				comment;

	private ResponsibilityType	definedBy;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public PositionType getAssociatedWith() {
		return associatedWith;
	}

	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public ResponsibilityType getDefinedBy() {
		return definedBy;
	}

	public void setAssociatedWith(PositionType associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDefinedBy(ResponsibilityType definedBy) {
		this.definedBy = definedBy;
	}

}
