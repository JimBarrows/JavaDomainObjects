/**
 * 
 */
package com.nsfwenterprises.biz360.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Several models are date range sensitive, this base class provides that basic
 * functionality.
 * 
 * @author jim
 * 
 */
@MappedSuperclass
public abstract class BaseDateRangeModel extends BasePersistentModel {

	private Date from = new Date();

	private Date thru;

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@Transient
	public boolean isActive() {
		Date now = new Date();
		boolean afterFrom = from.before(now) || from.equals(now);
		boolean beforeThru = thru == null || thru.after(now)
				|| thru.equals(now);
		return afterFrom && beforeThru;
	}

	@Transient
	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the fromdate.")
	public boolean isDateRangeValid() {
		if (thru == null) {
			return true;
		} else {
			return thru.after(from);
		}
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof BaseDateRangeModel)) {
			return false;
		}
		BaseDateRangeModel rhs = (BaseDateRangeModel) object;
		return new EqualsBuilder().append(this.thru, rhs.thru).append(
				this.from, rhs.from).isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1126585775, -1555222427).append(this.thru)
				.append(this.from).toHashCode();
	}

	@Column(name = "fromDate")
	@Temporal(TemporalType.DATE)
	@NotNull
	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	@Column(name = "thruDate")
	@Temporal(TemporalType.DATE)	
	public Date getThru() {
		return thru;
	}

	public void setThru(Date thru) {
		this.thru = thru;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
