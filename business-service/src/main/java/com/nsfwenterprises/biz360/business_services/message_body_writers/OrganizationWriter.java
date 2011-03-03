package com.nsfwenterprises.biz360.business_services.message_body_writers;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.sun.jersey.spi.resource.Singleton;

/**
 * Converts an organization object to a JSON string
 * 
 * @author jimbarrows
 * 
 */
@Singleton
@Provider
public class OrganizationWriter implements MessageBodyWriter<Organization> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(OrganizationWriter.class);

	@Override
	public long getSize(Organization t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		logger
				.debug("getSize(Organization, Class<?>, Type, Annotation[], MediaType) - start");

		// TODO Auto-generated method stub

		logger
				.debug("getSize(Organization, Class<?>, Type, Annotation[], MediaType) - end");
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		logger
				.debug("isWriteable(Class<?>, Type, Annotation[], MediaType) - start");

		// TODO Auto-generated method stub

		logger
				.debug("isWriteable(Class<?>, Type, Annotation[], MediaType) - end");		
		return mediaType.isCompatible(MediaType.APPLICATION_JSON_TYPE);
	}

	@Override
	public void writeTo(Organization t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream) throws IOException,
			WebApplicationException {
		mapper.writeValue(entityStream, t);

	}
	private final ObjectMapper mapper = new ObjectMapper();

}
