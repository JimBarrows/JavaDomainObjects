package mbmp.accounting_invoice.invoice.model.payment;


import javax.persistence.OneToOne;

import mbmp.accounting_invoice.accounting.model.transaction.PaymentAccountingTransaction;
import mbmp.accounting_invoice.budget.model.allocation.PaymentBudgetAllocation;

import java.util.List;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 10:39:18 AM
 */
public class Payment extends com.nsfwenterprises.biz360.invoice.model.payment.Payment{


 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
