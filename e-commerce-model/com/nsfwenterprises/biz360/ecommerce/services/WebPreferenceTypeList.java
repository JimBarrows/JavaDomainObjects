package com.nsfwenterprises.biz360.ecommerce.services;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.ecommerce.model.login.WebPreferenceType;

/**Retrieves a list of all WebPrefernce objects.
 * 
 * @author Jim.Barrows@gmail.com
 *
 */
@SuppressWarnings("serial")
@Name("webPreferenceTypeList")
public class WebPreferenceTypeList extends EntityQuery<WebPreferenceType> {

	/* (non-Javadoc)
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		
		return "select webPreferenceTypes from WebPreferenceType webPreferenceTypes";
	}

	
}
