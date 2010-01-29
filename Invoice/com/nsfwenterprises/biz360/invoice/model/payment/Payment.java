package com.nsfwenterprises.biz360.invoice.model.payment;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Payment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amount;
	
	private String comment;
	
	private Date effectiveDate;
	
	private PaymentMethodType paidVia;
	
	private String paymentRefNum;
	
	private List<PaymentApplication> usedToPay;
	
//	@OneToOne
//	private PaymentAccountingTransaction postedVia;
	
	public BigDecimal getAmount() {
		return amount;
	}
	public String getComment() {
		return comment;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	@ManyToOne
	public PaymentMethodType getPaidVia() {
		return paidVia;
	}
	public String getPaymentRefNum() {
		return paymentRefNum;
	}
	//	public PaymentAccountingTransaction getPostedVia() {
//		return postedVia;
//	}
//	public void setPostedVia(PaymentAccountingTransaction postedVia) {
//		this.postedVia = postedVia;
//	}
	@OneToMany
	public List<PaymentApplication> getUsedToPay() {
		return usedToPay;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public void setPaidVia(PaymentMethodType paidVia) {
		this.paidVia = paidVia;
	}
	public void setPaymentRefNum(String paymentRefNum) {
		this.paymentRefNum = paymentRefNum;
	}
	public void setUsedToPay(List<PaymentApplication> usedToPay) {
		this.usedToPay = usedToPay;
	}
}
