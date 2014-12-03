package jdo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Embeddable
public class DateTimeRange implements Serializable {
	
	private DateTime	from	= new DateTime();

	private DateTime	thru;

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@XmlTransient
	@Transient
	public boolean isActive() {
		return (from.isBeforeNow() || from.isEqualNow()) && (thru == null ? true : (thru.isAfterNow() || thru.isEqualNow()));
	}

	@XmlTransient
	@Transient
	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the from date.")
	public boolean isDateRangeValid() {
		boolean valid = false;
		if (from == null) {
			valid = false;
		} else if (thru == null) {
			valid = true;
		} else {
			valid = thru.isAfter(from);
		}
		return valid;
	}

	@Column(name = "fromDate")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@NotNull
	public DateTime getFrom() {
		return from;
	}

	public void setFrom(DateTime from) {
		this.from = from;
	}

	@Column(name = "thruDate")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	public DateTime getThru() {
		return thru;
	}

	public void setThru(DateTime thru) {
		this.thru = thru;
	}

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Override
	public String toString() {
		return "DateTimeRange [from=" + from + ", thru=" + thru + "]";
	}
}
