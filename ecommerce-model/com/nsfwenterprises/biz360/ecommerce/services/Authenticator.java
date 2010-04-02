package com.nsfwenterprises.biz360.ecommerce.services;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Identity;

import com.nsfwenterprises.biz360.ecommerce.model.login.UserLogin;

@Name("authenticator")
public class Authenticator {
	@Logger
	Log log;

	@In
	Identity identity;
	
	@Out(required=false)
	UserLogin userLogin;

	@In
	private EntityManager entityManager;

	public boolean authenticate() {
		log.info("authenticating #0", identity.getUsername());
		try {
			Query namedQuery = entityManager.createNamedQuery(UserLogin.FIND_BY_USER_ID_QUERY);
			namedQuery.setParameter(UserLogin.USER_ID_PARAM, identity.getUsername());
			userLogin = (UserLogin)namedQuery.getSingleResult();
			boolean loginForThisWebApp = userLogin.getLoginTo().getAddress().startsWith("/personalInformationManager");
			boolean passwordMatches = userLogin.getPassword().equals(identity.getPassword());

			return loginForThisWebApp && passwordMatches && userLogin.isActive();
		} catch (NoResultException e) {
			return false;
		}
		
	}
}
