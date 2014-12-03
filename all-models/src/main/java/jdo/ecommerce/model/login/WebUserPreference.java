package jdo.ecommerce.model.login;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class WebUserPreference extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private WebPreferenceType	describedBy;

	private UserLogin			preferenceFor;

	private String				value				= "default";

	public void setValue(String newValue) {
		this.value = newValue;
	}

	public String getValue() {
		return value;
	}

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
	 * @param describedBy
	 *            the describedBy to set
	 */
	public void setDescribedBy(WebPreferenceType describedBy) {
		this.describedBy = describedBy;
	}

	public void setPreferenceFor(UserLogin preferenceFor) {
		this.preferenceFor = preferenceFor;
	}
}
