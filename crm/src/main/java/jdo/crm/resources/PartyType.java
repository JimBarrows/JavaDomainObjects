package jdo.crm.resources;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jdo.dto.PartyTypeDto;
import jdo.dto.PartyTypeDtoList;
import jdo.party.model.Company;
import jdo.party.model.Organization;
import jdo.party.model.Person;

@Stateless
@Path("/partyTypes")
public class PartyType {

	private List<PartyTypeDto> list = new ArrayList<PartyTypeDto>();	
	
	@GET
	@Produces("application/json")
	public PartyTypeDtoList listAll(@QueryParam("start") Integer startPosition, @QueryParam("max") Integer maxResult) {
		
		return new PartyTypeDtoList(list);
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PartyTypeDto findById(@PathParam("id") String id) {
		return list.stream().filter(f -> f.getId().equals(id)).findFirst().orElse(null);
	}
	
	@PostConstruct
	public void init() {
		list.add(new PartyTypeDto(Company.class, "Company"));
		list.add(new PartyTypeDto(Organization.class, "Organization"));
		list.add(new PartyTypeDto(Person.class, "Person"));
	}
}
