package jdo.crm.util;

import jdo.crm.model.Aggregate;
import jdo.crm.model.CompanyCustomer;
import jdo.crm.model.OrganizationCustomer;
import jdo.crm.model.PersonCustomer;
import jdo.dto.CompanyDto;
import jdo.dto.CustomerDto;
import jdo.dto.OrganizationDto;
import jdo.dto.PersonDto;
import jdo.party.model.Organization;
import jdo.party.model.Person;

/**
 * A class holding all the possible converters from/to CustomerAggregate &
 * CustomerDto.
 *
 * @author Jim
 *
 */
public final class CustomerConverter {

	public static CustomerDto convert(final Aggregate persistedEntity) {
		return null;
	}

	/**
	 *
	 * @param from
	 *            the aggregate
	 * @return the dto
	 */
	public static CompanyDto convert(final CompanyCustomer from) {
		final PersonDto to = new PersonDto();
		to.setFirstName(from.getCustomer().getFirstName());
		to.setLastName(from.getCustomer().getLastName());
		to.setId(from.getId());
		return to;
	}

	public static Aggregate convert(final CustomerDto dto) {
		return null;
	}

	/**
	 *
	 * @param from
	 *            the aggregate
	 * @return the dto
	 */
	public static OrganizationDto convert(final OrganizationCustomer from) {
		final OrganizationDto to = new OrganizationDto();
		to.setName(from.getCustomer().getName());
		to.setId(from.getId());
		return to;
	}

	/**
	 * Convert the organizationdto into the organizationcustgomer aggregate.
	 *
	 * @param from
	 *            the dto.
	 * @return to the aggregate.
	 */
	public static Aggregate convert(final OrganizationDto from) {
		final OrganizationCustomer to = new OrganizationCustomer();
		final Organization organization = new Organization();
		organization.setName(from.getName());
		organization.setId(from.getId());
		to.setCustomer(organization);
		return to;
	}

	/**
	 *
	 * @param from
	 *            the aggregate
	 * @return the dto
	 */
	public static PersonDto convert(final PersonCustomer from) {
		final PersonDto to = new PersonDto();
		to.setFirstName(from.getCustomer().getFirstName());
		to.setLastName(from.getCustomer().getLastName());
		to.setId(from.getId());
		return to;
	}

	/**
	 * Convert the organizationdto into the organizationcustgomer aggregate.
	 *
	 * @param from
	 *            the dto.
	 * @return to the aggregate.
	 */
	public static Aggregate convert(final PersonDto from) {
		final PersonCustomer to = new PersonCustomer();
		final Person person = new Person();
		person.setFirstName(from.getFirstName());
		person.setLastName(from.getLastName());
		person.setId(from.getId());
		to.setCustomer(person);
		return to;
	}

	/**
	 * Convert the organizationdto into the organizationcustgomer aggregate.
	 *
	 * @param from
	 *            the dto.
	 * @return to the aggregate.
	 */
	public static Aggregate convert(final PersonDto from) {
		final PersonCustomer to = new PersonCustomer();
		final Person person = new Person();
		person.setFirstName(from.getFirstName());
		person.setLastName(from.getLastName());
		person.setId(from.getId());
		to.setCustomer(person);
		return to;
	}

	private CustomerConverter() {
		super();
	}
}
