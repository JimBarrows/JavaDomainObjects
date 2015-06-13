package jdo.dto;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.Serializable;

import javax.validation.constraints.AssertTrue;
import javax.xml.bind.annotation.XmlRootElement;

import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name = "customer")
@JsonRootName("customer")
public class CustomerDto implements Serializable {

	private Long	id;
	@NotEmpty
	private String	partyType;
	private String	name;
	private String	firstName;
	private String	lastName;

	public CustomerDto(Party party) {
		if (party instanceof Person) {
			partyType = ((Person) party).getClass().getCanonicalName();
			firstName = ((Person) party).getFirstName();
			lastName = ((Person) party).getLastName();
		} else if (party instanceof Organization) {
			partyType = ((Organization) party).getClass().getCanonicalName();
			name = ((Organization) party).getName();
		} else {
			throw new IllegalArgumentException(String.format("Customer must be person or Organization.  %s was passed instead.", party.getClass()
					.getCanonicalName()));
		}
		id = party.getId();
	}

	@AssertTrue
	public boolean hasName() {
		return isNotBlank( name) || isNotBlank( lastName);
	}
	
	public String getPartyType() {
		return partyType;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((partyType == null) ? 0 : partyType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDto other = (CustomerDto) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (partyType == null) {
			if (other.partyType != null)
				return false;
		} else if (!partyType.equals(other.partyType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", partyType=" + partyType + ", name=" + name + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public CustomerDto() {
		super();		
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
