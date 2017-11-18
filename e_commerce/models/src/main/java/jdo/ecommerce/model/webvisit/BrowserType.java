package jdo.ecommerce.model.webvisit;

import jdo.model.BaseType;

import javax.persistence.Entity;

@Entity
public class BrowserType extends BaseType {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				browserVersion;

	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

}
