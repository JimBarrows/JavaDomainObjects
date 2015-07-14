package jdo.fields;

import static java.time.ZonedDateTime.now;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Optional;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

@Embeddable
public class DateTimeRange implements Serializable {

	@NotNull
	private ZonedDateTime fromDate = now();

	private Optional<ZonedDateTime> thruDate = Optional.empty();

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@XmlTransient
	@Transient
	public boolean isActive() {
		ZonedDateTime now = now();
		return (fromDate.isBefore(now) || fromDate.isEqual(now))
				&& thruDate.map(thru -> thru.isAfter(now) || thru.isEqual(now)).orElse(true);
	}

	@XmlTransient
	@Transient
	@AssertTrue(message = "Dates are not valid the thru date must be empty, or after the from date.")
	public boolean isDateRangeValid() {
		boolean valid = false;
		if (fromDate == null) {
			valid = false;
		} else if (thruDate == null) {
			valid = false;
		} else {
			valid = thruDate.map(thru -> fromDate.isBefore(thru)).orElse(true);
		}
		return valid;
	}

	public ZonedDateTime getFromDate() {
		return fromDate;
	}

	public void setFromDate(ZonedDateTime fromDate) {
		this.fromDate = fromDate;
	}

	public Optional<ZonedDateTime> getThruDate() {
		return thruDate;
	}

	public void setThruDate(Optional<ZonedDateTime> thruDate) {
		this.thruDate = thruDate;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
