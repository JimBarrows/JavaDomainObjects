/**
 * 
 */
package com.nsfwenterprises.biz360.party.services.relationships;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.relationship.StatusType;

/**
 * @author Jim.Barrows@gmail.com
 * 
 */
@SuppressWarnings("serial")
@Name("statusTypeList")
public class StatusTypeList extends EntityQuery<StatusType> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select statusType from StatusType statusType";
	}

}
