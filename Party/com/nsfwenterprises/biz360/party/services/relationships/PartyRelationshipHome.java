package com.nsfwenterprises.biz360.party.services.relationships;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

@SuppressWarnings("serial")
@Name("partyRelationshipHome")
public class PartyRelationshipHome extends EntityHome<PartyRelationship> {
	
	@Factory("partyRelationship")
	public PartyRelationship init() {
		return getInstance();
	}
}
