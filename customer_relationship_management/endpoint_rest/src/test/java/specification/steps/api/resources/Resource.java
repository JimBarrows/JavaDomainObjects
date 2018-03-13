package specification.steps.api.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import jdo.web.ObjectMapperProvider;
import org.glassfish.jersey.filter.LoggingFilter;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.UUID;
import java.util.logging.Logger;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Represents the base resource of the API.
 *
 * @author Jim
 *
 * @param <T>
 *            The class that represents the resource on the server.
 */
public class Resource<T> {
	/**
	 * The JSON client the steps use.
	 */
	private final Client	client;
	/**
	 * The resource the client is accessing.
	 */
	private final WebTarget	resource;

	/**
	 * Construct the resource, using the provided path.
	 *
	 * @param path
	 *            The path to the resource, no leading "/" needed.
	 */
	public Resource(final String path) {
		final ObjectMapper objectMapper = new ObjectMapperProvider().getContext(null);

		client = ClientBuilder.newClient();
		client.register(new JacksonJaxbJsonProvider(objectMapper, null));
		client.register(new LoggingFilter(Logger.getGlobal(), true));
		resource = client.target("http://localhost:8090/crm/api").path("/" + path);
	}

	/**
	 * Post to the resource.
	 *
	 * @param dto
	 *            The object that gets converted to json, and then postedt to
	 *            the resource.
	 * @return the response from the server.
	 */
	public Response post(final T dto) {
		return resource.request().accept(APPLICATION_JSON).post(Entity.json(dto));
	}

	/**
	 * Put to the resource.
	 *
	 * @param id
	 *            The id of the resource being retrieved.
	 * @param dto
	 *            The object that gets converted to json, and then put in the
	 *            resource.
	 * @return the response from the server.
	 */
	public Response put(final UUID id, final T dto) {

		return resource.path(id.toString()).request().accept(APPLICATION_JSON).put(Entity.json(dto));
	}

	/**
	 * Get a resource by it's id.
	 *
	 * @param id
	 *            of the resource to get.
	 *
	 * @return the response from the server.
	 */
	public Response getById(final UUID id) {
		return resource.path(id.toString()).request().accept(APPLICATION_JSON).get();
	}

	/**
	 * Delete the resource by it's id.
	 *
	 * @param id
	 *            of the resource being deleted.
	 * @return The response from the server.
	 */
	public Response delete(final UUID id) {
		return resource.path(id.toString()).request().delete();
	}
}
