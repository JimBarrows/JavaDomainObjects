package jdo.dto;

import java.util.UUID;

import org.hibernate.validator.constraints.NotBlank;

/**
 * A person customer data transfer object.
 *
 * @author Jim
 *
 */
public class PersonDto extends CustomerDto {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The first name if it's a person.
	 */
	@NotBlank
	private String firstName;

	/**
	 * The last name if it's a person.
	 */
	@NotBlank
	private String lastName;

	/**
	 *
	 */
	public PersonDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public PersonDto(final UUID id, final String firstName, final String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 *
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 *
	 * @param firstName
	 *            of the person.
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 *
	 * @param lastName
	 *            of the person.
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("PersonDto [firstName=%s, lastName=%s, getId()=%s]", firstName, lastName, getId());
	}
}
