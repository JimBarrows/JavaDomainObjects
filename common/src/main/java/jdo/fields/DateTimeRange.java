package jdo.fields;

import jdo.jpa.converters.ZonedDateTimeToTimestampConverter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Convert;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.time.ZonedDateTime;

import static java.time.ZonedDateTime.now;

@Embeddable
public class DateTimeRange implements Serializable {

	@NotNull
	@Convert(converter = ZonedDateTimeToTimestampConverter.class)
	private ZonedDateTime fromDate = now();

	/**
	 * TODO When hibernate can handle a converter of type Option
	 * <ZonedDatetime> use this. private Optional<ZonedDateTime> thruDate =
	 * Optional.empty();
	 */
	@Convert(converter = ZonedDateTimeToTimestampConverter.class)
	private ZonedDateTime thruDate = null;

	public ZonedDateTime getThruDate() {
		return thruDate;
	}

	public void setThruDate(ZonedDateTime thruDate) {
		this.thruDate = thruDate;
	}

	/**
	 * Determines if a model is active. A model is active if now is after or
	 * equal to from , and thru is either null, or after now, or equal to now.
	 */
	@XmlTransient
	@Transient
	public boolean isActive() {
		ZonedDateTime now = now();
		return (fromDate.isBefore(now) || fromDate.isEqual(now)) && (thruDate == null) || (thruDate.isAfter(now) || thruDate.isEqual(now));
		// thruDate.map(thru -> thru.isAfter(now) ||
		// thru.isEqual(now)).orElse(true);
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
			// valid = thruDate.map(thru ->
			// fromDate.isBefore(thru)).orElse(true);
			valid = fromDate.isBefore(thruDate);
		}
		return valid;
	}

	public ZonedDateTime getFromDate() {
		return fromDate;
	}

	public void setFromDate(ZonedDateTime fromDate) {
		this.fromDate = fromDate;
	}

	// public Optional<ZonedDateTime> getThruDate() {
	// return thruDate;
	// }
	//
	// public void setThruDate(Optional<ZonedDateTime> thruDate) {
	// this.thruDate = thruDate;
	// }

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("fromDate", fromDate)
				.append("thruDate", thruDate)
				.toString();
	}
}
