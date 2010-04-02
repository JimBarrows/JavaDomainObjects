package com.nsfwenterprises.accounting_invoice.invoice.model.payment;

import com.nsfwenterprises.accounting_invoice.accounting.model.transaction.PaymentAccountingTransaction;
import com.nsfwenterprises.accounting_invoice.budget.model.allocation.PaymentBudgetAllocation;

import javax.persistence.OneToOne;
import java.util.List;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 10:39:18 AM
 */
public class Payment extends com.nsfwenterprises.biz360.invoice.model.payment.Payment{


 public List<PaymentBudgetAllocation> getBookedAgainst() {
        return bookedAgainst;
    }

    public void setBookedAgainst(List<PaymentBudgetAllocation> bookedAgainst) {
        this.bookedAgainst = bookedAgainst;
    }

    private List<PaymentBudgetAllocation> bookedAgainst;

    @OneToOne
    private PaymentAccountingTransaction postedVia;

    public PaymentAccountingTransaction getPostedVia() {
        return postedVia;
    }

    public void setPostedVia(PaymentAccountingTransaction postedVia) {
        this.postedVia = postedVia;
    }
}
