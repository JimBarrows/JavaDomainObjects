package jdo.converters;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import org.joda.time.DateTime;

/**
 * @author Xavier Coulon
 */
@Provider
public class MyBeanConverterProvider implements ParamConverterProvider {
	/**
	 * Logger for this class
	 */
	private static final Logger	logger	= LogManager.getLogger(MyBeanConverterProvider.class.getName());

	@SuppressWarnings("unchecked")
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> clazz, Type type, Annotation[] annotations) {
		logger.debug("getConverter(Class<T> clazz, Type type, Annotation[] annotations) - start");

		if (clazz.getName().equals(DateTime.class.getName())) {

			ParamConverter<T> returnParamConverter = (ParamConverter<T>) new MyConverterProvider();
			logger.debug("getConverter(Class<T>, Type, Annotation[]) - end - return value={}", returnParamConverter);
			return returnParamConverter;
		}

		logger.debug("getConverter(Class<T>, Type, Annotation[]) - end - return value=null");
		return null;
	}

}