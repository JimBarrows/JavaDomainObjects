package com.nsfwenterprises.biz360.ecommerce.services;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.ecommerce.model.login.LoginAccountHistory;

@SuppressWarnings("serial")
@Name("loginAccountHistoryList")
public class LoginAccountHistoryList extends EntityQuery<LoginAccountHistory> {

	/* (non-Javadoc)
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		
		return "select loginAccountHistory from LoginAccountHistory loginAccountHistory";
	}
}
