package mbms.party.ui.web.controllers;

import java.io.Serializable;

public class TabController implements Serializable {

	private String currentTab;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public String getCurrentTab() {
		return currentTab;
	}


	public void setCurrentTab(String currentTab) {
		this.currentTab = currentTab;
	}

}
