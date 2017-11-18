package jdo.accounting.model.asset;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Property extends FixedAsset {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of PostalAddress.
	 * 
	 */
	private UUID address;

	public UUID getAddress() {
		return address;
	}

	public void setAddress(UUID address) {
		this.address = address;
	}
}
