package jdo.accounting.model.asset;

import javax.persistence.Entity;

@Entity
public class Equipment extends FixedAsset {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				modelNumber;
	private String				serialNumber;

	public String getModelNumber() {
		return modelNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}
