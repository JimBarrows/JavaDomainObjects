package jdo.accounting.model;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.accounting.model.asset.PeriodType;

import jdo.fields.DateTimeRange;

import jdo.model.BasePersistentModel;

/**
 * Represents a single accounting period, it's length defined by the
 * dateTimeRange.
 * 
 * @author Jim
 *
 */
@Entity
public class AccountingPeriod extends BasePersistentModel {

    /**The period number within the cycle (ie monthly would be 1-12).
     * 
     */
    @Min(0)
    private int accountingPeriodNumber;

    /**
     * UUID of PartyRole.
     * 
     */
    private UUID accountPeriodFor;

    /**
     * What type of period.
     */
    @ManyToOne
    private PeriodType definedBy;

    /**
     * The date range for the period.
     */
    @Embedded
    private DateTimeRange dateTimeRange = new DateTimeRange();

    /**
     * 
     * @return dateTimeRange
     */
   public final DateTimeRange getDateTimeRange() {
	return dateTimeRange;
    }

   /**
    * 
    * @param newDateTimeRange The new datetime range
    */
   public final void setDateTimeRange(final DateTimeRange newDateTimeRange) {
	this.dateTimeRange = newDateTimeRange;
    }

   /**
    * 
    * @return accountingPeriodNumber
    */
   public final int getAccountingPeriodNumber() {
	return accountingPeriodNumber;
    }

   /**
    * 
    * @return UUID
    */
   public final UUID getAccountPeriodFor() {
	return accountPeriodFor;
    }

   /**
    * 
    * @return definedBy
    */
   public final PeriodType getDefinedBy() {
	return definedBy;
    }

   /**
    * 
    * @param newAccountingPeriodNumber The accounting period number
    */
   public final void setAccountingPeriodNumber(final int newAccountingPeriodNumber) {
	this.accountingPeriodNumber = newAccountingPeriodNumber;
    }

   /**
    * 
    * @param newAccountPeriodFor uuid
    */
   public final void setAccountPeriodFor(final UUID newAccountPeriodFor) {
	this.accountPeriodFor = newAccountPeriodFor;
    }

   /**
    * 
    * @param newDefinedBy PeriodType
    */
   public final void setDefinedBy(final PeriodType newDefinedBy) {
	this.definedBy = newDefinedBy;
    }

   /**
    * 
    */
    private static final long serialVersionUID = 1L;
}
