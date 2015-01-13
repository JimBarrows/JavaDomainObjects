package jdo.humanresoures.model.performance;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.humanresoures.model.position.Position;
import jdo.humanresoures.model.position.salary.PayHistory;
import jdo.invoice.model.payment.Paycheck;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Entity
public class PerformanceReview extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long						serialVersionUID	= 1L;

	@ManyToOne
	private PayHistory									affecting;

	@Lob
	private String											comments;

	@ManyToOne
	private PartyRole										forEmployee;

	@ManyToOne
	private PartyRole										fromManager;

	@OneToMany
	private List<PerformanceReviewItem>	items;

	@ManyToOne
	private Position										newPosition;

	@ManyToOne
	private Paycheck										bonus;

	@Embedded
	private DateTimeRange								dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Paycheck getBonus() {
		return bonus;
	}

	public void setBonus(Paycheck bonus) {
		this.bonus = bonus;
	}

	public PayHistory getAffecting() {
		return affecting;
	}

	public String getComments() {
		return comments;
	}

	public PartyRole getForEmployee() {
		return forEmployee;
	}

	public PartyRole getFromManager() {
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

	public void setForEmployee(PartyRole forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setFromManager(PartyRole fromManager) {
		this.fromManager = fromManager;
	}

	public void setItems(List<PerformanceReviewItem> items) {
		this.items = items;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

}
