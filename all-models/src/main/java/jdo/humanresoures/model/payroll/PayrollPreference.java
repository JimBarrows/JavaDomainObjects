package jdo.humanresoures.model.payroll;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.invoice.model.payment.PaymentMethodType;
import jdo.model.BaseDateRangeModel;
import jdo.party.model.PartyRole;

@Entity
public class PayrollPreference extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String accountNumber;
	
	private String bankName;
	
	private BigDecimal flatAmount;
	
	private PartyRole forEmployee;
	
	private PartyRole forInternalOrganization;
	

	
	private int percentage;
	
	private PeriodType period;
	
	private String routingNumber;
	
	private DeductionType type;
	
	private PaymentMethodType paymentMethodType;
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

	public BigDecimal getFlatAmount() {
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

	@ManyToOne
	public DeductionType getType() {
		return type;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setFlatAmount(BigDecimal flatAmount) {
		this.flatAmount = flatAmount;
	}

	public void setForEmployee(PartyRole forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setForInternalOrganization(
			PartyRole forInternalOrganization) {
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