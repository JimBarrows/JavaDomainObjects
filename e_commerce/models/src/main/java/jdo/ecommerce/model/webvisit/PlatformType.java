package jdo.ecommerce.model.webvisit;

import jdo.model.Type;

import javax.persistence.Entity;

@Entity
public class PlatformType extends Type {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				platformVersion;

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

}
