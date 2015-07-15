package jdo.party.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A single person the system keeps track of.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:34 AM
 */
@Entity
@XmlRootElement
@jdo.validations.annotations.AtLeastOneNotBlank(fieldNames = { "firstName", "lastName" })
public class Person extends Party {

	private String	firstName;

	private String	lastName;

	private String	middleName;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", id=" + getId() + ", version=" + getVersion() + "]";
	}

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
}