package com.bizondemand.humanresources_invoice.humanresources.model.payroll;

import com.nsfwenterprises.biz360.invoice.model.payment.PaymentMethodType;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 9:15:32 AM
 */
public class PayrollPreference extends com.nsfwenterprises.biz360.humanresoures.model.payroll.PayrollPreference {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PaymentMethodType paymentMethodType;
	public PaymentMethodType getPaymentMethodType() {
		return paymentMethodType;
	}
	public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}
}
