package jdo.jpa.converters;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ZonedDateTimeToTimestampConverter implements AttributeConverter<ZonedDateTime, java.sql.Timestamp> {

	private ZoneId defaultZoneId = ZoneId.of("UTC+00:00");

	@Override
	public java.sql.Timestamp convertToDatabaseColumn(ZonedDateTime entityValue) {
		if (entityValue == null) {
			return null;
		} else {
			return java.sql.Timestamp.from(entityValue.withZoneSameInstant(defaultZoneId).toInstant());
		}
	}

	@Override
	public ZonedDateTime convertToEntityAttribute(java.sql.Timestamp databaseValue) {
		if (databaseValue == null) {
			return null;
		} else {
			return ZonedDateTime.of(databaseValue.toLocalDateTime(), defaultZoneId);
		}
	}
}
