package jdo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Embeddable
public class DateTimeRange implements Serializable {

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@NotNull
	private DateTime	fromDate	= new DateTime();

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime	thruDate;

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@XmlTransient
	@Transient
	public boolean isActive() {
		return (fromDate.isBeforeNow() || fromDate.isEqualNow()) && (thruDate == null ? true : (thruDate.isAfterNow() || thruDate.isEqualNow()));
	}

	@XmlTransient
	@Transient
	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the from date.")
	public boolean isDateRangeValid() {
		boolean valid = false;
		if (fromDate == null) {
			valid = false;
		} else if (thruDate == null) {
			valid = true;
		} else {
			valid = thruDate.isAfter(fromDate);
		}
		return valid;
	}
	
	public DateTime getFromDate() {
		return fromDate;
	}

	public void setFromDate(DateTime fromDate) {
		this.fromDate = fromDate;
	}

	public DateTime getThruDate() {
		return thruDate;
	}

	public void setThruDate(DateTime thruDate) {
		this.thruDate = thruDate;
	}

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	
}
