package jdo.ecommerce.model.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class WebUserPreference extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private WebPreferenceType	describedBy;

	@ManyToOne
	private UserLogin			preferenceFor;

	@NotEmpty
	@Column(name="preferenceValue")
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
	
	public WebPreferenceType getDescribedBy() {
		return describedBy;
	}

	
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
