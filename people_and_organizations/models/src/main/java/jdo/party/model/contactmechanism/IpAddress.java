package jdo.party.model.contactmechanism;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

/**
 * 
 * @author Jim.Barrows@gmail.com
 * @See "The Data Model Resource Book, Revised Edition Volume 2 Figure 2.7 pg 421"
 */
@Entity
public class IpAddress extends ElectronicAddress {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Pattern(regexp = "[012][012345][012345].[012][012345][012345].[012][012345][012345].[012][012345][012345]")
	@Override
	@Column(insertable=false, updatable=false)
	public String getAddress() {
		return super.getAddress();
	}	

}
