package jdo.web;

import java.util.List;
import java.util.Locale;

import javax.validation.ConstraintViolationException;
import javax.validation.Path.Node;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.commons.collections.IteratorUtils;

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {
	@Context
	private HttpHeaders headers;

	public Response toResponse(ConstraintViolationException ex) {
		MediaType type = headers.getMediaType();
		Locale locale = headers.getLanguage();

		Object responseObject = getConstraintViolationErrors(ex);

		Response.ResponseBuilder builder = Response.ok(responseObject, type);
		builder.status(422);
		builder.language(locale);
		return builder.build();
	}

	@SuppressWarnings("unchecked")
	public static Errors getConstraintViolationErrors(ConstraintViolationException ex) {
		Errors errors = new Errors();

		ex.getConstraintViolations().forEach(violation -> {
			List<Node> list = IteratorUtils.toList(violation.getPropertyPath().iterator());
			Node node = list.get(list.size() - 1);
			if (errors.containsKey(node.getName())) {
				errors.get(node.getName()).add(violation.getMessage());
			} else {
				errors.put(node.getName(), violation.getMessage());
			}

		});

		return errors;
	}
}
