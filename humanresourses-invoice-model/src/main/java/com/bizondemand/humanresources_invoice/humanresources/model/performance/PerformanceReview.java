package com.bizondemand.humanresources_invoice.humanresources.model.performance;

import com.bizondemand.humanresources_invoice.invoice.model.payment.Paycheck;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 9:10:50 AM
 */
public class PerformanceReview extends com.nsfwenterprises.biz360.humanresoures.model.performance.PerformanceReview{

    private Paycheck bonus;

    public Paycheck getBonus() {
        return bonus;
    }

    public void setBonus(Paycheck bonus) {
        this.bonus = bonus;
    }
}
