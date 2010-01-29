package com.nsfwenterprises.biz360.party.controllers;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityController;

@SuppressWarnings("serial")
@Name("partyNameController")
@Scope(ScopeType.PAGE)
public class PartyNameController extends EntityController {

	private int count=0;
	
	public int getCount() {
		return count++;
	}
	
}
