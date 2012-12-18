package mbmp.invoice.model.payment;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import mbmp.accounting.model.transaction.PaymentAccountingTransaction;
import mbmp.budget.model.PaymentBudgetAllocation;
import mbmp.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
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
