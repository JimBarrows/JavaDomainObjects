package mbmp.ecommerce.model.party.contactmechanism;

import javax.persistence.Entity;

import mbmp.party.model.contactmechanism.ContactMechanism;

import org.hibernate.validator.NotEmpty;

@Entity
public class ElectronicAddress extends ContactMechanism {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String address;

	@NotEmpty
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
