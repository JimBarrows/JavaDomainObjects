package jdo.dto;

import java.util.UUID;

import javax.validation.constraints.NotNull;

/**
 * The organization as a customer data transfer objects.
 *
 * @author Jim
 *
 */
public class OrganizationDto extends CustomerDto {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Name of the party if it's not a person.
	 *
	 */
	@NotNull
	private String name;

	public OrganizationDto() {
	}

	public OrganizationDto(final UUID id, final String name) {
		super(id);
		this.name = name;
	}

	/**
	 *
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 *            of the organization
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("OrganizationDto [name=%s, getId()=%s]", name, getId());
	}
}
