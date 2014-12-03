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

	private String				comment;

	private Position			manager;

	private boolean				primary;

	private Position			subordinate;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public String getComment() {
		return comment;
	}

	@ManyToOne
	public Position getManager() {
		return manager;
	}

	@ManyToOne
	public Position getSubordinate() {
		return subordinate;
	}

	@Column(name = "isPrimary")
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
