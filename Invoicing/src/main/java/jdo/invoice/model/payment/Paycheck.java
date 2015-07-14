package jdo.invoice.model.payment;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class Paycheck extends Disbursement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of Deduction.
	 * 
	 */
	private List<UUID> deductions;

	/**
	 * UUID of PartyRole.
	 * 
	 */
	private UUID issuedFrom;

	/**
	 * UUID of PartyRole.
	 * 
	 */
	private UUID issuedTo;

	public List<UUID> getDeductions() {
		return deductions;
	}

	public UUID getIssuedFrom() {
		return issuedFrom;
	}

	public UUID getIssuedTo() {
		return issuedTo;
	}

	public void setDeductions(List<UUID> deductions) {
		this.deductions = deductions;
	}

	public void setIssuedFrom(UUID issuedFrom) {
		this.issuedFrom = issuedFrom;
	}

	public void setIssuedTo(UUID issuedTo) {
		this.issuedTo = issuedTo;
	}

}
