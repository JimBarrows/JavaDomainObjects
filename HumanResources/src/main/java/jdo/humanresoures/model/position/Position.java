package jdo.humanresoures.model.position;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import jdo.humanresoures.model.position.fulfillment.PositionFulfillment;
import jdo.humanresoures.model.position.fulfillment.PositionStatus;
import jdo.humanresoures.model.position.structure.PositionReportingStructure;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class Position extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for BudgetItem.
	 * 
	 */
	private UUID approvedThru;

	@OneToMany
	private List<PositionResponsibility> assigendTo;

	@Temporal(TemporalType.DATE)
	private Date estimatedFromDate;

	@Temporal(TemporalType.DATE)
	private Date estimatedThruDate;

	private boolean exempt;

	@OneToMany
	private List<PositionFulfillment> filledBy;

	private boolean fulltime;

	@OneToMany(mappedBy = "subordinate")
	private List<PositionReportingStructure> manages;

	@OneToMany(mappedBy = "manager")
	private List<PositionReportingStructure> reportsTo;

	private boolean salary;

	@ManyToOne
	private PositionStatus status;

	@Column(name = "isATemp")
	private boolean temporary;

	@ManyToOne
	private PositionType type;

	/**
	 * UUID for Organization.
	 * 
	 */
	private UUID within;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getApprovedThru() {
		return approvedThru;
	}

	public List<PositionResponsibility> getAssigendTo() {
		return assigendTo;
	}

	public Date getEstimatedFromDate() {
		return estimatedFromDate;
	}

	public Date getEstimatedThruDate() {
		return estimatedThruDate;
	}

	public List<PositionFulfillment> getFilledBy() {
		return filledBy;
	}

	public List<PositionReportingStructure> getManages() {
		return manages;
	}

	public List<PositionReportingStructure> getReportsTo() {
		return reportsTo;
	}

	public PositionStatus getStatus() {
		return status;
	}

	public PositionType getType() {
		return type;
	}

	public UUID getWithin() {
		return within;
	}

	public boolean isExempt() {
		return exempt;
	}

	public boolean isFulltime() {
		return fulltime;
	}

	@Transient
	public boolean isManager() {
		return !manages.isEmpty();
	}

	public boolean isSalary() {
		return salary;
	}

	public boolean isTemporary() {
		return temporary;
	}

	public void setApprovedThru(UUID approvedThru) {
		this.approvedThru = approvedThru;
	}

	public void setAssigendTo(List<PositionResponsibility> assigendTo) {
		this.assigendTo = assigendTo;
	}

	public void setEstimatedFromDate(Date estimatedFromDate) {
		this.estimatedFromDate = estimatedFromDate;
	}

	public void setEstimatedThruDate(Date estimatedThruDate) {
		this.estimatedThruDate = estimatedThruDate;
	}

	public void setExempt(boolean exempt) {
		this.exempt = exempt;
	}

	public void setFilledBy(List<PositionFulfillment> filledBy) {
		this.filledBy = filledBy;
	}

	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}

	public void setManages(List<PositionReportingStructure> manages) {
		this.manages = manages;
	}

	public void setReportsTo(List<PositionReportingStructure> reportsTo) {
		this.reportsTo = reportsTo;
	}

	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	public void setStatus(PositionStatus status) {
		this.status = status;
	}

	public void setTemporary(boolean temporary) {
		this.temporary = temporary;
	}

	public void setType(PositionType type) {
		this.type = type;
	}

	public void setWithin(UUID within) {
		this.within = within;
	}

}
