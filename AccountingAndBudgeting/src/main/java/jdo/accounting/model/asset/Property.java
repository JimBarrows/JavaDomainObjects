package jdo.accounting.model.asset;

import java.util.UUID;

import javax.persistence.Entity;

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
