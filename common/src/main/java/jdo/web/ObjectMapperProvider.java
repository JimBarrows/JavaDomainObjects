package jdo.web;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Provides a configured object mapper for the jackson json serializer.
 *
 * @author Jim
 *
 */
@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper> {

	/**
	 * The object mapper being provided.
	 *
	 */
	private final ObjectMapper objectMapper;

	/**
	 * Construct the object mapper.
	 *
	 */
	public ObjectMapperProvider() {
		objectMapper = new ObjectMapper();
		// objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE,
		// true);
		// objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
	}

	/**
	 * Actually provide it.
	 */
	@Override
	public ObjectMapper getContext(@SuppressWarnings("rawtypes") final Class type) {
		return objectMapper;
	}
}
