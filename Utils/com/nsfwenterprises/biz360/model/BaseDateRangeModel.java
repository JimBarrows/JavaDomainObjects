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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.AssertTrue;
import org.hibernate.validator.NotNull;

/**
 * Several models are date range sensitive, this base class provides that basic
 * functionality.
 * 
 * @author jim
 * 
 */
@MappedSuperclass
public abstract class BaseDateRangeModel extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date from;

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

	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the fromdate.")
	public boolean areDatesValid() {
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

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Column(name = "fromDate")
	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getThru() {
		return thru;
	}

	public void setThru(Date thru) {
		this.thru = thru;
	}

}
