package jdo.crm.resources;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import jdo.dto.PartyTypeDto;
import jdo.dto.PartyTypeDtoList;
import jdo.party.model.Company;
import jdo.party.model.Organization;
import jdo.party.model.Person;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * This is so the client can get a list of the classes that inherit from Party.
 * 
 * @author Jim
 *
 */
@Stateless
@Api(value = "/partyTypes", description = "Operations about party types")
@Path("/partyTypes")
public class PartyType {

	/**
	 * The list of subclasses.
	 */
	private List<PartyTypeDto> list = new ArrayList<PartyTypeDto>();

	/**
	 * Get the list.
	 * 
	 * @param offset
	 *            The beginning of the sub set of the list.
	 * @param limit
	 *            THa maximum number to return.
	 * @return The list, or it's subset.
	 */
	@GET
	@Produces(APPLICATION_JSON)
	@ApiOperation(value = "List All", notes = "Return a list of all party types.", response = PartyTypeDtoList.class)
	public final PartyTypeDtoList listAll(@QueryParam("offset") final Integer offset,
			@QueryParam("limit") final Integer limit) {

		return new PartyTypeDtoList(list);
	}

	/**
	 * Get one class type.
	 * 
	 * @param id
	 *            of the class type to get.
	 * @return The class type, or throw a NotFoundException.
	 */
	@GET
	@Path("/{id}")
	@Produces(APPLICATION_JSON)
	@ApiOperation(value = "Find By Id", notes = "The id should be the FQN of the party type class.", response = PartyTypeDto.class)
	public final PartyTypeDto findById(@NotNull @PathParam("id") final String id) {
		return list.stream().filter(f -> f.getId().equals(id)).findFirst().orElseThrow(() -> new NotFoundException());
	}

	/**
	 * Initialize by adding the classes to the list.
	 * 
	 */
	@PostConstruct
	public final void init() {
		list.add(new PartyTypeDto(Company.class, "Company"));
		list.add(new PartyTypeDto(Organization.class, "Organization"));
		list.add(new PartyTypeDto(Person.class, "Person"));
	}
}
