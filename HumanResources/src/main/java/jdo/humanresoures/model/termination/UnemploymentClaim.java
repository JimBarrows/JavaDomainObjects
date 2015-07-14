package jdo.humanresoures.model.termination;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class UnemploymentClaim extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date claimDate;

	private String description;

	/**
	 * UUID for Employment.
	 * 
	 */
	private UUID resultingFrom;

	@ManyToOne
	private UnemploymentClaimStatusType status;

	public Date getClaimDate() {
		return claimDate;
	}

	public String getDescription() {
		return description;
	}

	public UUID getResultingFrom() {
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

	public void setResultingFrom(UUID resultingFrom) {
		this.resultingFrom = resultingFrom;
	}

	public void setStatus(UnemploymentClaimStatusType status) {
		this.status = status;
	}

}
