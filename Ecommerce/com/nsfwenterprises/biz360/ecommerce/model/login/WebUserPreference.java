package com.nsfwenterprises.biz360.ecommerce.model.login;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class WebUserPreference extends BasePersistentModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private WebPreferenceType describedBy;
	
	private UserLogin preferenceFor;

	/**
	 * @return the describedBy
	 */
	@ManyToOne
	public WebPreferenceType getDescribedBy() {
		return describedBy;
	}

	@ManyToOne
	public UserLogin getPreferenceFor() {
		return preferenceFor;
	}

	/**
	 * @param describedBy the describedBy to set
	 */
	public void setDescribedBy(WebPreferenceType describedBy) {
		this.describedBy = describedBy;
	}

	public void setPreferenceFor(UserLogin preferenceFor) {
		this.preferenceFor = preferenceFor;
	}
}
