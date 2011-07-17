package mbmp.business_services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mbmp.party.model.Organization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/businessheirarchy")
public class BusinessHeirarchy {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(BusinessHeirarchy.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Organization asApplicationJson() {
		logger.debug("asApplicationJson() - start");

		Organization organization = new Organization();
		organization.setName("New ORG");

		logger.debug("asApplicationJson() - end");
		return organization;
	}
}
