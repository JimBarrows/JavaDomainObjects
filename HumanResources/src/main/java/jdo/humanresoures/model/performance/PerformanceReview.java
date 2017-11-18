package jdo.humanresoures.model.performance;

import jdo.fields.DateTimeRange;
import jdo.humanresoures.model.position.Position;
import jdo.humanresoures.model.position.salary.PayHistory;
import jdo.model.PersistentEntity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class PerformanceReview extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private PayHistory affecting;

	@Lob
	private String comments;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID forEmployee;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID fromManager;

	@OneToMany
	private List<PerformanceReviewItem> items;

	@ManyToOne
	private Position newPosition;

	/**
	 * UUID for Paycheck.
	 * 
	 */
	private UUID bonus;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getBonus() {
		return bonus;
	}

	public void setBonus(UUID bonus) {
		this.bonus = bonus;
	}

	public PayHistory getAffecting() {
		return affecting;
	}

	public String getComments() {
		return comments;
	}

	public UUID getForEmployee() {
		return forEmployee;
	}

	public UUID getFromManager() {
		return fromManager;
	}

	public List<PerformanceReviewItem> getItems() {
		return items;
	}

	public Position getNewPosition() {
		return newPosition;
	}

	public void setAffecting(PayHistory affecting) {
		this.affecting = affecting;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setForEmployee(UUID forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setFromManager(UUID fromManager) {
		this.fromManager = fromManager;
	}

	public void setItems(List<PerformanceReviewItem> items) {
		this.items = items;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

}
