package com.nsfwenterprises.biz360.humanresoures.model.termination;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.relationship.Employment;

@Entity
public class UnemploymentClaim extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date claimDate;
	
	private String description;
	
	private Employment resultingFrom;
	
	private UnemploymentClaimStatusType status;

	public Date getClaimDate() {
		return claimDate;
	}

	public String getDescription() {
		return description;
	}

	@ManyToOne
	public Employment getResultingFrom() {
		return resultingFrom;
	}

	@ManyToOne
	public UnemploymentClaimStatusType getStatus() {
		return status;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setResultingFrom(Employment resultingFrom) {
		this.resultingFrom = resultingFrom;
	}

	public void setStatus(UnemploymentClaimStatusType status) {
		this.status = status;
	}

}
