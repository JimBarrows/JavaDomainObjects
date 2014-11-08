package jdo.party.model;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * A single person the system keeps track of.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:34 AM
 */
@SuppressWarnings("serial")
@Entity
public class Person extends Party {
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	private String middleName;

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
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", id=" + id + ", version="
				+ version + "]";
	}

}