package jdo.ecommerce.model.webvisit;

import javax.persistence.Entity;

import jdo.model.BaseType;

@Entity
public class PlatformType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String platformVersion;

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}


}
