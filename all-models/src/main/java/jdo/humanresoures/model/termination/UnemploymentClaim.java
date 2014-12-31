package jdo.humanresoures.model.termination;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.relationship.Employment;

@Entity
public class UnemploymentClaim extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long						serialVersionUID	= 1L;

	private Date												claimDate;

	private String											description;

	@ManyToOne
	private Employment									resultingFrom;

	@ManyToOne
	private UnemploymentClaimStatusType	status;

	public Date getClaimDate() {
		return claimDate;
	}

	public String getDescription() {
		return description;
	}

	public Employment getResultingFrom() {
		return resultingFrom;
	}

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
