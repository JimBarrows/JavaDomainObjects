/**
 * 
 */
package com.nsfwenterprises.biz360.party.services.relationships;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

/**
 * @author Jim.Barrows@gmail.com
 * 
 */
@SuppressWarnings("serial")
@Name("partyRelationshipList")
public class PartyRelationshipList extends EntityQuery<PartyRelationship> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select partyRelationship from PartyRelationship partyRelationship";
	}

}
