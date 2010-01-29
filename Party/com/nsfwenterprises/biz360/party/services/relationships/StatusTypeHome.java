package com.nsfwenterprises.biz360.party.services.relationships;

import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.relationship.StatusType;

@SuppressWarnings("serial")
@Name("statusTypeHome")
public class StatusTypeHome extends EntityHome<StatusType> {

	
	@RequestParameter
	private Long statusTypeId;
	
	
	@Override
	public Object getId() {
		if( statusTypeId ==null) {
				return super.getId();
		}else {
			return statusTypeId;
		}
	}
	
	@Override
	@Begin(nested=true)
	public void create() {
		super.create();
	}
	
	@Factory("statusType")
	public StatusType init() {
		return getInstance();
	}
	
}
