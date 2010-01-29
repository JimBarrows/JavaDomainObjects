/**
 * 
 */
package com.nsfwenterprises.biz360.party.services.relationships;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.relationship.PriorityType;

/**
 * @author Jim.Barrows@gmail.com
 * 
 */
@SuppressWarnings("serial")
@Name("priorityTypeList")
public class PriorityTypeList extends EntityQuery<PriorityType> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select priorityType from PriorityType priorityType";
	}

}
