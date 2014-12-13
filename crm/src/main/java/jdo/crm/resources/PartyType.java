package jdo.crm.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import jdo.dto.PartyTypeDto;
import jdo.dto.PartyTypeDtoList;
import jdo.party.model.Company;
import jdo.party.model.Organization;
import jdo.party.model.Person;

@Stateless
@Path("/partyTypes")
public class PartyType {

	@GET
	@Produces("application/json")
	public PartyTypeDtoList listAll(@QueryParam("start") Integer startPosition, @QueryParam("max") Integer maxResult) {
		List<PartyTypeDto> list = new ArrayList<PartyTypeDto>();
		list.add(new PartyTypeDto(Company.class, "Company"));
		list.add(new PartyTypeDto(Organization.class, "Organization"));
		list.add(new PartyTypeDto(Person.class, "Person"));
		return new PartyTypeDtoList(list);
	}
}
