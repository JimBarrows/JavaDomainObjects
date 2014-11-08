package jdo.accounting.model.asset;

import javax.persistence.Entity;

@Entity
public class Vehicle extends FixedAsset {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String vehicleIdentificationNumber;

	public String getVehicleIdentificationNumber() {
		return vehicleIdentificationNumber;
	}

	public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}
}
