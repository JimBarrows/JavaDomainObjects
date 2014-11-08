package jdo.humanresoures.model.position;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import jdo.budget.model.BudgetItem;
import jdo.humanresoures.model.position.fulfillment.PositionFulfillment;
import jdo.humanresoures.model.position.fulfillment.PositionStatus;
import jdo.humanresoures.model.position.structure.PositionReportingStructure;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BaseDateRangeModel;
import jdo.party.model.Organization;

@Entity
public class Position extends BaseDateRangeModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BudgetItem approvedThru;
	
	private List<PositionResponsibility> assigendTo;
	
	private Date estimatedFromDate;
	
	private Date estimatedThruDate;
	
	private boolean exempt;
	
	private List<PositionFulfillment> filledBy;	
	
	private boolean fulltime;
	
	private List<PositionReportingStructure> manages;
	
	private List<PositionReportingStructure> reportsTo;
	
	private boolean salary;

	private PositionStatus status;
	
	private boolean temporary;
	
	private PositionType type;
	
	private Organization within;
	
	public BudgetItem getApprovedThru() {
		return approvedThru;
	}
	
	@OneToMany
	public List<PositionResponsibility> getAssigendTo() {
		return assigendTo;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstimatedFromDate() {
		return estimatedFromDate;
	}

	@Temporal(TemporalType.DATE)
	public Date getEstimatedThruDate() {
		return estimatedThruDate;
	}

	@OneToMany
	public List<PositionFulfillment> getFilledBy() {
		return filledBy;
	}

	@OneToMany(mappedBy="subordinate")
	public List<PositionReportingStructure> getManages() {
		return manages;
	}

	@OneToMany(mappedBy="manager")
	public List<PositionReportingStructure> getReportsTo() {
		return reportsTo;
	}

	@ManyToOne
	public PositionStatus getStatus() {
		return status;
	}

	@ManyToOne
	public PositionType getType() {
		return type;
	}

	public Organization getWithin() {
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
		return ! manages.isEmpty();
	}

	public boolean isSalary() {
		return salary;
	}

	@Column(name="isATemp")
	public boolean isTemporary() {
		return temporary;
	}

	public void setApprovedThru(BudgetItem approvedThru) {
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

	public void setWithin(Organization within) {
		this.within = within;
	}

}
