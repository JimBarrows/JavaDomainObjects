package com.nsfwenterprises.biz360.party.services.relationships;

import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.relationship.PriorityType;

@SuppressWarnings("serial")
@Name("priorityTypeHome")
public class PriorityTypeHome extends EntityHome<PriorityType> {

	
	@RequestParameter
	private Long priorityTypeId;
	
	
	@Override
	public Object getId() {
		if( priorityTypeId ==null) {
				return super.getId();
		}else {
			return priorityTypeId;
		}
	}
	
	@Override
	@Begin(nested=true)
	public void create() {
		super.create();
	}
	
	@Factory("priorityType")
	public PriorityType initPriorityType() {
		return getInstance();
	}
	
}
