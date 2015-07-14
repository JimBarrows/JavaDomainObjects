package jdo.jpa.converters;

import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDatePersistenceConverter implements AttributeConverter<LocalDate, java.sql.Date> {
	@Override
	public java.sql.Date convertToDatabaseColumn(LocalDate entityValue) {
		return java.sql.Date.valueOf(entityValue);
	}

	@Override
	public LocalDate convertToEntityAttribute(java.sql.Date databaseValue) {
		return databaseValue.toLocalDate();
	}
}
