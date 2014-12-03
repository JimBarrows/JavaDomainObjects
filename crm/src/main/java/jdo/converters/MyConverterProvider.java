package jdo.converters;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

/**
 * @author Xavier Coulon
 *
 */
@Provider
public class MyConverterProvider implements ParamConverterProvider {
	/**
	 * Logger for this class
	 */
	private static final Logger	logger	= LogManager.getLogger(MyConverterProvider.class.getName());

	@Override
	public <T> ParamConverter<T> getConverter(final Class<T> rawType, final Type genericType, final Annotation[] annotations) {
		if (rawType.getName().equals(DateTime.class.getName())) {
			return new ParamConverter<T>() {

				@Override
				public T fromString(String value) {
					logger.debug("$ParamConverter<T>.fromString(String) - Value being converterd - String value={}", value);

					try {
						return rawType.cast(ISODateTimeFormat.dateTimeNoMillis().parseDateTime(value));
					} catch (IllegalArgumentException e) {
						return rawType.cast(ISODateTimeFormat.dateTime().parseDateTime(value));
					}
				}

				@Override
				public String toString(T myBean) {
					if (myBean == null) {
						return null;
					}

					logger.debug("$ParamConverter<T>.toString(T) - My Bean is - T myBean={}", myBean);

					return ISODateTimeFormat.dateTimeNoMillis().print((DateTime)myBean);
				}
			};
		}
		return null;
	}

}