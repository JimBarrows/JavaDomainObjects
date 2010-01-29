/**
 * 
 */
package com.nsfwenterprises.biz360.party.services;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.Party;

/**
 * @author Jim.Barrows@gmail.com
 * 
 */
@SuppressWarnings("serial")
@Name("partyList")
public class PartyList extends EntityQuery<Party> {

	private String name = "";

	@Override
	public String getEjbql() {
		return "select party from Party party "
				+ "where (lower(party.firstName) like lower(concat('" + name
				+ "','%'))) " + "or (lower(party.name) like lower(concat('"
				+ name + "','%'))) "
				+ "or (lower(party.lastName) like lower(concat('" + name
				+ "','%')))";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
