package com.nsfwenterprises.biz360.humanresoures.model.performance;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.humanresoures.model.position.Position;
import com.nsfwenterprises.biz360.humanresoures.model.position.salary.PayHistory;
import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.role.Employee;
import com.nsfwenterprises.biz360.party.model.role.Manager;

@Entity
public class PerformanceReview extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PayHistory affecting;
	
	
	
	private String comments;
	
	private Employee forEmployee;
	
	private Manager fromManager;
	
	private List<PerformanceReviewItem> items;
	
	private Position newPosition;

	@ManyToOne
	public PayHistory getAffecting() {
		return affecting;
	}

	public String getComments() {
		return comments;
	}

	public Employee getForEmployee() {
		return forEmployee;
	}

	public Manager getFromManager() {
		return fromManager;
	}

	@OneToMany
	public List<PerformanceReviewItem> getItems() {
		return items;
	}

	@ManyToOne
	public Position getNewPosition() {
		return newPosition;
	}

	public void setAffecting(PayHistory affecting) {
		this.affecting = affecting;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setForEmployee(Employee forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setFromManager(Manager fromManager) {
		this.fromManager = fromManager;
	}

	public void setItems(List<PerformanceReviewItem> items) {
		this.items = items;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

}
