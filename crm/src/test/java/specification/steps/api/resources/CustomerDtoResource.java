package specification.steps.api.resources;

import jdo.dto.CustomerDto;

/**
 * Represents the "/customer" resource on the server.
 *
 * @author Jim
 *
 */
public class CustomerDtoResource extends Resource<CustomerDto> {

	/**
	 * Create the resource by providing the "customer" path.
	 *
	 */
	public CustomerDtoResource() {
		super("customers");
	}

}
