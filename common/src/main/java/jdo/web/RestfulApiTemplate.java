package jdo.web;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static org.apache.commons.beanutils.BeanUtils.copyProperties;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import jdo.core.repository.Repository;

/**
 * Base template covering the create, read all, read one, update & delete
 * functions.
 *
 * @author Jim
 *
 * @param <R>
 *            The repository type for the entity.
 * @param <E>
 *            The entity type.
 * @param <D>
 *            The DTO type.
 */
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public abstract class RestfulApiTemplate<R extends Repository<E>, E, D> {

	protected abstract E convertDto(D dto);

	protected abstract D convertEntity(E persistedEntity);

	protected List<D> convertEntityList(final List<E> entityList) {
		final List<D> dtoList = new ArrayList<>();
		for (final E entity : entityList) {
			dtoList.add(convertEntity(entity));
		}
		return dtoList;
	}

	/**
	 * Map a post to the URL as the create function.
	 *
	 * @param dto
	 *            representing the entity that gets created.
	 * @return the dto for the entity that was created.
	 */
	@POST
	public D create(final D dto) {
		final E entity = convertDto(dto);
		final E persistedEntity = repository().create(entity);
		return convertEntity(persistedEntity);
	}

	/**
	 * Map a delete to the url with id to an actual delete.
	 *
	 * @param id
	 *            of the entity to delete.
	 */
	@DELETE
	@Path("/{id}")
	public void delete(@NotNull @PathParam("id") final UUID id) {
		repository().delete(id);
	}

	/**
	 * Map a get to the URL to get a list of all entities.
	 *
	 * @return The list of entities as DTO's.
	 */
	@GET
	public List<D> getAll() {
		final List<E> findAll = repository().findAll(Optional.empty(), Optional.empty());
		return convertEntityList(findAll);
	}

	/**
	 * Map a get request to the URL with the id the findByIdMethod of the
	 * repository.
	 *
	 * @param id
	 *            The id of the entity.
	 * @return The dto representation of the entity.
	 */
	@GET
	@Path("/{id}")
	public D getOne(@NotNull @PathParam("id") final UUID id) {
		final Optional<E> findById = repository().findById(id);
		return convertEntity(findById.orElseThrow(() -> new NotFoundException()));
	}

	protected abstract R repository();

	/**
	 * Map a put to the URL to an update.
	 *
	 * @param id
	 *            of the object being updated.
	 * @param dto
	 *            representing the entity to update.
	 * @return The dto representing the updated entity.
	 * @throws IllegalAccessException
	 *             If the properties cannot be copied between the original and
	 *             updated entity.
	 * @throws InvocationTargetException
	 *             If the properties cannot be copied between the original and
	 *             updated entity.
	 *
	 */
	@PUT
	@Path("/{id}")
	public D update(@NotNull @PathParam("id") final UUID id, final D dto)
			throws IllegalAccessException, InvocationTargetException {
		final E updatedEntity = convertDto(dto);
		final E original = repository().findById(id).orElseThrow(() -> new NotFoundException());
		copyProperties(original, updatedEntity);
		final E update = repository().update(original);
		return convertEntity(update);

	}

}
