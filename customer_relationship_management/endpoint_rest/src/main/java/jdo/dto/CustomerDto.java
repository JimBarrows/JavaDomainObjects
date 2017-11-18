package jdo.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.AssertTrue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.UUID;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

/**
 * A data transfer object that represents the data for a customer.
 * 
 * @author Jim
 *
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "customer")
@JsonRootName("customer")
public class CustomerDto implements Serializable {

	/**
	 * The id of the customer, which is the ID of the party.
	 * 
	 */
	@XmlAttribute
	@NotEmpty
	private UUID id;

	/**
	 * The type of the party.
	 */
	@XmlAttribute
	@NotEmpty
	private String partyType;

	/**
	 * Name of the party if it's not a person.
	 * 
	 */
	@XmlAttribute
	private String name;
	/**
	 * The first name if it's a person.
	 */
	@XmlAttribute
	private String firstName;
	/**
	 * The last name if it's a person.
	 */
	@XmlAttribute
	private String lastName;

	/**
	 * Construct the dto from Party.
	 * 
	 * @param party
	 *            The class to get the data from.
	 */
	public CustomerDto(final Party party) {
		if (party instanceof Person) {
			partyType = (( Person ) party).getClass().getCanonicalName();
			firstName = (( Person ) party).getFirstName();
			lastName = (( Person ) party).getLastName();
		} else if (party instanceof Organization) {
			partyType = (( Organization ) party).getClass().getCanonicalName();
			name = (( Organization ) party).getName();
		} else {
			throw new IllegalArgumentException(
					String.format("Customer must be person or Organization.  %s was passed instead.",
							party.getClass().getCanonicalName()));
		}
		id = party.getId();
	}

	/**
	 * Validate that the customer has a name, and at least a lastname.
	 * 
	 * @return true if there is a name or last name.
	 */
	@AssertTrue
	public final boolean hasName() {
		return isNotBlank(name) || isNotBlank(lastName);
	}

	/**
	 * 
	 * @return the party type.
	 */
	public final String getPartyType() {
		return partyType;
	}

	/**
	 * 
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public final boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomerDto other = ( CustomerDto ) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public final String toString() {
		return "CustomerDto [id=" + id + ", partyType=" + partyType + ", name=" + name + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

	/**
	 * 
	 * @return firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @return lastName
	 */
	public final String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @return id.
	 */
	public final UUID getId() {
		return id;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor, don't use if you want to actually have data in the
	 * object..
	 */
	public CustomerDto() {
		super();
	}

	/**
	 * Construct the DTO with the fields provided.
	 * 
	 * @param id
	 *            of the party.
	 * @param partyType
	 *            class of the party.
	 * @param name
	 *            present if not a person.
	 * @param firstName
	 *            possibly present if a person.
	 * @param lastName
	 *            present if a person.
	 */
	public CustomerDto(final UUID id, final String partyType, final String name, final String firstName,
			final String lastName) {
		super();
		this.id = id;
		this.partyType = partyType;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
