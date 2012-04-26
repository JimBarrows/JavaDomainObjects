package mbmp.ecommerce.model.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Transient;

import mbmp.ecommerce.model.party.contactmechanism.WebAddress;
import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;

import org.hibernate.validator.NotEmpty;

/**The login for a user also specifies which pages, or web addresses that login may view.
 * 
 * @author Jim.Barrows@gmail.com
 * @See The Data Model Resource Book, Revised Edition Volume 2 Figure 2.7 pg 421
 */
@SuppressWarnings("serial")
@Entity
@NamedQueries(@NamedQuery(name = "findByUserId", query = "select userLogin from UserLogin userLogin where userLogin.userId = :userId"))
public class UserLogin extends BasePersistentModel{

	public static final String FIND_BY_USER_ID_QUERY = "findByUserId";
	public static final String USER_ID_PARAM = "userId";
	
	private boolean active = false;

	private Map<String,WebUserPreference> governedBy = new HashMap<String,WebUserPreference>();
	
	private List<LoginAccountHistory> having = new ArrayList<LoginAccountHistory>();
	
	private Party loginFor;
	
	private WebAddress loginTo;
		
	private String password;	
	
	private String userId;
	
		
	public void addLoginAccountHistory(LoginAccountHistory loginAccountHistory) {
		having.add(loginAccountHistory);
	}
	
	/**
	 * @return the governedBy
	 */
	@OneToMany(mappedBy="preferenceFor")
	public Map<String, WebUserPreference> getGovernedBy() {
		return governedBy;
	}
	
	/**
	 * @return the having
	 */
	@OneToMany(cascade=CascadeType.ALL)
	@OrderBy(value="loggedInFrom")
	public List<LoginAccountHistory> getHaving() {
		return having;
	}

	@Transient
	public LoginAccountHistory getLastLogin() {
		return having.get(having.size()-1);
	}

	/**
	 * @return the loginFor
	 */
	@ManyToOne
	public Party getLoginFor() {
		return loginFor;
	}

	/**
	 * @return the loginTo
	 */
	@ManyToOne
	public WebAddress getLoginTo() {
		return loginTo;
	}

	/**
	 * @return the password
	 */
	@NotEmpty
	public String getPassword() {
		return password;
	}

	/**
	 * @return the userId
	 */
	@NotEmpty
	public String getUserId() {
		return userId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @param governedBy the governedBy to set
	 */
	public void setGovernedBy(Map<String,WebUserPreference> governedBy) {
		this.governedBy = governedBy;
	}

	/**
	 * @param having the having to set
	 */
	public void setHaving(List<LoginAccountHistory> having) {
		this.having = having;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param loginFor the loginFor to set
	 */
	public void setLoginFor(Party loginFor) {
		this.loginFor = loginFor;
	}


	/**
	 * @param loginTo the loginTo to set
	 */
	public void setLoginTo(WebAddress loginTo) {
		this.loginTo = loginTo;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	
	

}
