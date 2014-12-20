package jdo.ember.providers;

import java.util.Locale;

import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import jdo.ember.dto.Errors;

@Provider
public class PersistenceExceptionMapper implements ExceptionMapper<PersistenceException> {

    @Context
    private HttpHeaders headers;

    public Response toResponse(PersistenceException ex) {


        MediaType type = headers.getMediaType();
        Locale locale = headers.getLanguage();

        Errors responseObject = new Errors();
        if (ex.getCause() instanceof ConstraintViolationException) {
            responseObject = ConstraintViolationExceptionMapper.getConstraintViolationErrors((ConstraintViolationException) ex.getCause());
        } else {
           responseObject.put("", ex.getLocalizedMessage());
           
        }

        Response.ResponseBuilder builder = Response.ok(responseObject, type);
        builder.status(422);
        builder.language(locale);
        return builder.build();
    }
}
