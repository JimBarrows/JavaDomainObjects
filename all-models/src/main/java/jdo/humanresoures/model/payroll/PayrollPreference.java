package jdo.humanresoures.model.payroll;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.fields.Money;
import jdo.invoice.model.payment.PaymentMethodType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Entity
public class PayrollPreference extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String						accountNumber;

	private String						bankName;

	@Embedded
	private Money							flatAmount;

	@ManyToOne
	private PartyRole					forEmployee;

	@ManyToOne
	private PartyRole					forInternalOrganization;

	private int								percentage;

	@ManyToOne
	private PeriodType				period;

	private String						routingNumber;

	@ManyToOne
	private DeductionType			type;

	@ManyToOne
	private PaymentMethodType	paymentMethodType;

	@Embedded
	private DateTimeRange			dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PaymentMethodType getPaymentMethodType() {
		return paymentMethodType;
	}

	public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
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

	public PartyRole getForEmployee() {
		return forEmployee;
	}

	public PartyRole getForInternalOrganization() {
		return forInternalOrganization;
	}

	public int getPercentage() {
		return percentage;
	}

	public PeriodType getPeriod() {
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

	public void setForEmployee(PartyRole forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setForInternalOrganization(PartyRole forInternalOrganization) {
		this.forInternalOrganization = forInternalOrganization;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setPeriod(PeriodType period) {
		this.period = period;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public void setType(DeductionType type) {
		this.type = type;
	}

}
