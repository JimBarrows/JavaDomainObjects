package jdo.humanresoures.model.position;

import jdo.fields.DateTimeRange;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class ValidResponsibility extends PersistentEntity {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@ManyToOne
	private PositionType				associatedWith;

	@Lob
	private String							comment;

	@ManyToOne
	private ResponsibilityType	definedBy;

	@Embedded
	private DateTimeRange				dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PositionType getAssociatedWith() {
		return associatedWith;
	}

	public String getComment() {
		return comment;
	}

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
