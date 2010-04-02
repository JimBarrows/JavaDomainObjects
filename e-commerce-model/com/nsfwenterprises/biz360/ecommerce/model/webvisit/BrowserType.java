package com.nsfwenterprises.biz360.ecommerce.model.webvisit;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.model.BaseType;

@Entity
public class BrowserType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String browserVersion;

	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}
	
}
