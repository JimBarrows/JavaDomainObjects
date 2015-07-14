package jdo.humanresoures.model.payroll;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
public class PayrollPreference extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String accountNumber;

	private String bankName;

	@Embedded
	private Money flatAmount;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID forEmployee;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID forInternalOrganization;

	private int percentage;

	/**
	 * UUID for PeriodType.
	 * 
	 */
	private UUID period;

	private String routingNumber;

	@ManyToOne
	private DeductionType type;

	/**
	 * UUID for PaymentMethodType.
	 * 
	 */
	private UUID paymentMethodType;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getPaymentMethodType() {
		return paymentMethodType;
	}

	public void setPaymentMethodType(UUID paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public Money getFlatAmount() {
		return flatAmount;
	}

	public UUID getForEmployee() {
		return forEmployee;
	}

	public UUID getForInternalOrganization() {
		return forInternalOrganization;
	}

	public int getPercentage() {
		return percentage;
	}

	public UUID getPeriod() {
		return period;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public DeductionType getType() {
		return type;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setFlatAmount(Money flatAmount) {
		this.flatAmount = flatAmount;
	}

	public void setForEmployee(UUID forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setForInternalOrganization(UUID forInternalOrganization) {
		this.forInternalOrganization = forInternalOrganization;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setPeriod(UUID period) {
		this.period = period;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public void setType(DeductionType type) {
		this.type = type;
	}

}
