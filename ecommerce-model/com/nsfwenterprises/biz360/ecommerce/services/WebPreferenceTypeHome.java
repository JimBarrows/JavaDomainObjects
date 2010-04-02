package com.nsfwenterprises.biz360.ecommerce.services;

import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.ecommerce.model.login.WebPreferenceType;

/**
 * Provides CRUD support for WebReferenceType.
 * 
 * @author Jim.Barrows@gmail.com
 * 
 */
@SuppressWarnings("serial")
@Name("webPreferenceTypeHome")
public class WebPreferenceTypeHome extends EntityHome<WebPreferenceType> {

	private WebPreferenceType webPreferenceType;

	@RequestParameter
	private Long webPreferenceTypeId;

	@Override
	public Object getId() {
		if (webPreferenceTypeId == null) {
			return super.getId();
		} else {
			return webPreferenceTypeId;
		}
	}

	@Override
	@Begin(join = true)
	public void create() {
		super.create();
	}

	@Factory("webPreferenceType")
	public WebPreferenceType initWebPreferenceType() {
		return getInstance();
	}

	/**
	 * @return the webPreferenceType
	 */
	public WebPreferenceType getWebPreferenceType() {
		return webPreferenceType;
	}

	/**
	 * @param webPreferenceType
	 *            the webPreferenceType to set
	 */
	public void setWebPreferenceType(WebPreferenceType webPreferenceType) {
		this.webPreferenceType = webPreferenceType;
	}

	/**
	 * @return the webPreferenceTypeId
	 */
	public Long getWebPreferenceTypeId() {
		return webPreferenceTypeId;
	}

	/**
	 * @param webPreferenceTypeId
	 *            the webPreferenceTypeId to set
	 */
	public void setWebPreferenceTypeId(Long webPreferenceTypeId) {
		this.webPreferenceTypeId = webPreferenceTypeId;
	}
}
