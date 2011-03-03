package com.nsfwenterprises.biz360.party.model.contactmechanism;

import javax.persistence.Entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;



/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:39 AM
 */
@SuppressWarnings("serial")
@Entity
public class TelecommunicationsNumber extends ContactMechanism {

	private boolean acceptsData = false;
	
	private boolean acceptsFaxes = false;
	

	private boolean acceptsTextMessages = false;
	

	@NotEmpty
	@Length(max=3,min=3)

	private String areaCode;
	
	@NotEmpty
	private String contactNumber;
	
	private String countryCode;
	
	private String extension;

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof TelecommunicationsNumber)) {
			return false;
		}
		TelecommunicationsNumber rhs = (TelecommunicationsNumber) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.acceptsTextMessages, rhs.acceptsTextMessages).append(
				this.extension, rhs.extension).append(this.contactNumber,
				rhs.contactNumber).append(this.areaCode, rhs.areaCode).append(
				this.countryCode, rhs.countryCode).append(this.acceptsData,
				rhs.acceptsData).append(this.acceptsFaxes, rhs.acceptsFaxes)
				.isEquals();
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getExtension() {
		return extension;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-1710239425, 1116714533).appendSuper(
				super.hashCode()).append(this.acceptsTextMessages).append(
				this.extension).append(this.contactNumber)
				.append(this.areaCode).append(this.countryCode).append(
						this.acceptsData).append(this.acceptsFaxes)
				.toHashCode();
	}

	public boolean isAcceptsData() {
		return acceptsData;
	}

	public boolean isAcceptsFaxes() {
		return acceptsFaxes;
	}

	public boolean isAcceptsTextMessages() {
		return acceptsTextMessages;
	}

	public void setAcceptsData(boolean acceptsData) {
		this.acceptsData = acceptsData;
	}

	public void setAcceptsFaxes(boolean acceptsFaxes) {
		this.acceptsFaxes = acceptsFaxes;
	}

	public void setAcceptsTextMessages(boolean acceptsTextMessages) {
		this.acceptsTextMessages = acceptsTextMessages;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}