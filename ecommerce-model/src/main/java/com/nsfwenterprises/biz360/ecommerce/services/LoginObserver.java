package com.nsfwenterprises.biz360.ecommerce.services;

import java.util.Date;

import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Identity;

import com.nsfwenterprises.biz360.ecommerce.model.login.LoginAccountHistory;
import com.nsfwenterprises.biz360.ecommerce.model.login.UserLogin;
import com.nsfwenterprises.biz360.party.controllers.PartyTabController;

@Name("loginObserver")
public class LoginObserver {
	/**
	 * Logger for this class
	 */
	@Logger
	Log logger;

	@In
	Identity identity;
	@In
	UserLogin userLogin;
	@In
	EntityManager entityManager;
	@In(create=true)
	PartyTabController partyTabController;

	@Observer("org.jboss.seam.security.loginSuccessful")
	public void onSuccessfulLogin() {
		logger.debug("onSuccessfulLogin() - start"); //$NON-NLS-1$

		LoginAccountHistory loginAccountHistory = new LoginAccountHistory(
				new Date(), identity.getUsername(), identity.getPassword());
		userLogin.addLoginAccountHistory(loginAccountHistory);
		entityManager.merge(userLogin);
		partyTabController.setCurrentTab("summaryTab");

		logger.debug("onSuccessfulLogin() - end"); //$NON-NLS-1$
	}

	@Observer("org.jboss.seam.security.loggedOut")
	public void onLogOut() {
		logger.debug("onLogOut() - start"); //$NON-NLS-1$
		LoginAccountHistory lastLogin = userLogin.getLastLogin();
		lastLogin.setLoggedInThru(new Date());
		entityManager.merge(lastLogin);

		logger.debug("onLogOut() - end"); //$NON-NLS-1$
	}
}
