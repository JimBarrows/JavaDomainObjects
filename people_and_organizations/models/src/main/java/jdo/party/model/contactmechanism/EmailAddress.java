package jdo.party.model.contactmechanism;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EmailAddress extends ElectronicAddress {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Email
	@Override
	@Column(insertable=false, updatable=false)
	public String getAddress() {
		return super.getAddress();
	}	

}
