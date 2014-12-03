package jdo.product.model.storage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:38 AM
 */
@Entity
public class SerializedInventoryItem extends InventoryItem {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@NotNull
	@Column(nullable = false, unique = true)
	private String				serialNumber;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}