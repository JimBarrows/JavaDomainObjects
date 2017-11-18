package jdo.invoice.model.account;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class FinancialAccountRole extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Party.
	 * 
	 */
	private UUID accountFor;

	@ManyToOne
	private FinancialAccountRoleType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getAccountFor() {
		return accountFor;
	}

	public FinancialAccountRoleType getType() {
		return type;
	}

	public void setAccountFor(UUID accountFor) {
		this.accountFor = accountFor;
	}

	public void setType(FinancialAccountRoleType type) {
		this.type = type;
	}

}
