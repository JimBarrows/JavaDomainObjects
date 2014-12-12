package jdo.dto;

import java.text.Format;

import javax.xml.bind.annotation.XmlRootElement;

import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;

@XmlRootElement
public class CustomerDto {

	private String	partyType;
	private String	name;
	private String	firstName;
	private String	lastName;

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerDto( Party party) {
		if (party instanceof Person) {
			partyType = ((Person)party).getClass().getCanonicalName();
			firstName =((Person)party).getFirstName();
			lastName = ((Person)party).getLastName();
		} else if( party instanceof Organization){
			partyType = ((Organization)party).getClass().getCanonicalName();
			name =((Organization)party).getName();
		} else {
			throw new IllegalArgumentException(String.format("Customer must be person or Organization.  %s was passed instead.", party.getClass().getCanonicalName()));
		}
	}
	
	public boolean isPerson() {
		return partyType == Person.class.getCanonicalName();
	}
	
	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		return "CustomerDto [partyType=" + partyType + ", name=" + name + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	

}
