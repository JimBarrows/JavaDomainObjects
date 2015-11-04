package jdo.crm.resources;

import static jdo.crm.util.CustomerConverter.convert;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import com.wordnik.swagger.annotations.Api;

import jdo.application.ApplicationConfiguration;
import jdo.crm.model.Aggregate;
import jdo.crm.model.CustomerRepository;
import jdo.dto.CustomerDto;
import jdo.web.RestfulApiTemplate;

/**
 * Functionality behind the customers resource.
 *
 * @author Jim
 *
 */
@Api(value = "/customers", description = "Operations about customers")
@RequestScoped
@Path("/customers")
public class CustomerResource extends RestfulApiTemplate<CustomerRepository, Aggregate, CustomerDto> {

	@EJB
	CustomerRepository					repository;
	/**
	 * The configuration of the application.
	 *
	 */
	@EJB
	private ApplicationConfiguration	configuration;

	@Override
	protected Aggregate convertDto(final CustomerDto dto) {
		return convert(dto);
	}

	@Override
	protected CustomerDto convertEntity(final Aggregate persistedEntity) {

		return convert(persistedEntity);
	}

	@Override
	protected CustomerRepository repository() {
		return repository;
	}

}
