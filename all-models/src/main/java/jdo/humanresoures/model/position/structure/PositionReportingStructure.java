package jdo.humanresoures.model.position.structure;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.humanresoures.model.position.Position;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class PositionReportingStructure extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String						comment;

	private Position					manager;

	@Column(name = "isPrimary")
	private boolean						primary;

	@ManyToOne
	private Position					subordinate;

	@Embedded
	private DateTimeRange			dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public String getComment() {
		return comment;
	}

	public Position getManager() {
		return manager;
	}

	public Position getSubordinate() {
		return subordinate;
	}

	public boolean isPrimary() {
		return primary;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setManager(Position manager) {
		this.manager = manager;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

	public void setSubordinate(Position subordinate) {
		this.subordinate = subordinate;
	}

}
