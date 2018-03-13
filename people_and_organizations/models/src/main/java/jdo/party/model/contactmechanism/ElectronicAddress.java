package jdo.party.model.contactmechanism;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class ElectronicAddress extends ContactMechanism {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Lob
	private String address;

	@NotEmpty
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
