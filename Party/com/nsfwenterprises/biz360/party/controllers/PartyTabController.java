package com.nsfwenterprises.biz360.party.controllers;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityController;
import org.richfaces.component.html.HtmlTabPanel;

@SuppressWarnings("serial")
@Name("partyTabController")
@Scope(ScopeType.SESSION)
public class PartyTabController extends EntityController {
		
	private String currentTab="firstTab";
	
	private HtmlTabPanel tabPanel;

	public HtmlTabPanel getTabPanel() {
		return tabPanel;
	}

	public void setTabPanel(HtmlTabPanel tabPanel) {
		this.tabPanel = tabPanel;
	}

	public String getCurrentTab() {
		return currentTab;
	}

	public void setCurrentTab(String currentTab) {
		this.currentTab = currentTab;
	}
}
