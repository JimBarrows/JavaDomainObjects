package specification.steps.api.resources;

import jdo.dto.CustomerDto;

/**
 * Represents the "/customer" resource on the server.
 *
 * @author Jim
 *
 */
public class CustomerDtoResourceClient extends ResourceClient<CustomerDto> {

	/**
	 * Create the resource by providing the "customer" path.
	 *
	 */
	public CustomerDtoResourceClient() {
		super("customers");
	}

}
