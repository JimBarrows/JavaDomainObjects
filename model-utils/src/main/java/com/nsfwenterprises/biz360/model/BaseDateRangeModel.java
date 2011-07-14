/**
 * 
 */
package com.nsfwenterprises.biz360.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

/**
 * Several models are date range sensitive, this base class provides that basic
 * functionality.
 * 
 * @author jim
 * 
 */
@MappedSuperclass
public abstract class BaseDateRangeModel extends BasePersistentModel {

	private DateTime from = new DateTime();

	private DateTime thru;
	
	

	public BaseDateRangeModel() {
		super();
	}

	public BaseDateRangeModel(Long id, Long version, DateTime from, DateTime thru) {
		super(id, version);
		this.from = from;
		this.thru = thru;
	}
	
	public BaseDateRangeModel(Long id, Long version, DateTime from) {
		super(id, version);
		this.from = from;
		this.thru = null;
	}
	
	public BaseDateRangeModel( DateTime from) {
		super();
		this.from = from;
		this.thru = null;
	}

	public BaseDateRangeModel(DateTime from, DateTime thru) {
		this.from = from;
		this.thru = thru;
	}

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@Transient
	public boolean isActive() {
		return (from.isBeforeNow() || from.isEqualNow()) && (thru == null ? true : (thru.isAfterNow() || thru.isEqualNow()));
	}

	@Transient
	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the from date.")
	public boolean isDateRangeValid() {
		boolean valid = false;
		if( from == null) {
			valid = false;
		}else if (thru == null) {
			valid = true;
		} else {
			valid = thru.isAfter(from);
		}
		return valid;
	}

	@Column(name = "fromDate")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@NotNull
	public DateTime getFrom() {
		return from;
	}

	public void setFrom(DateTime from) {
		this.from = from;
	}

	@Column(name = "thruDate")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	public DateTime getThru() {
		return thru;
	}

	public void setThru(DateTime thru) {
		this.thru = thru;
	}
	
	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof BaseDateRangeModel)) {
			return false;
		}
		BaseDateRangeModel rhs = (BaseDateRangeModel) object;
		return new EqualsBuilder().appendSuper(super.equals(rhs))
				.append(this.thru, rhs.thru).append(this.from, rhs.from)
				.isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1126585775, -1555222427)
				.appendSuper(super.hashCode()).append(this.thru)
				.append(this.from).toHashCode();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseDateRangeModel [from=");
		builder.append(from);
		builder.append(", thru=");
		builder.append(thru);
		builder.append(", id=");
		builder.append(id);
		builder.append(", version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}

}
