package mbmp.humanresources_invoice.humanresources.model.payroll;

import mbmp.humanresources_invoice.invoice.model.payment.Paycheck;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 9:21:36 AM
 */
public class Deduction extends mbmp.humanresoures.model.payroll.Deduction{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Paycheck reductionOf;

	public Paycheck getReductionOf() {
		return reductionOf;
	}

	public void setReductionOf(Paycheck reductionOf) {
		this.reductionOf = reductionOf;
	}
}
