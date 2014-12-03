package jdo.crm.resources;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import jdo.core.repository.specification.Specification;
import jdo.party.model.Party;
import jdo.party.repositories.PartyRepository;

@Stateless
@Path("/customers")
public class Customer {

	@EJB
	private PartyRepository	partyRepo;

	@GET
	@Produces("application/json")
	public List<Party> listAll(@QueryParam("start") Integer startPosition, @QueryParam("max") Integer maxResult) {
		Specification<Party> customerSpecification = new Specification<Party>() {

			@Override
			public boolean isSatisifiedBy(Party entity) {
				return true;
			}
		};
		return partyRepo.findBy(customerSpecification);
	}
}
