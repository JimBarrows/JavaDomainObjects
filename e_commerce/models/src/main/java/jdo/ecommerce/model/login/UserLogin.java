package jdo.ecommerce.model.login;

import jdo.model.BasePersistentModel;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.*;

import static jdo.encryption.Encrypter.encryptThis;

/**
 * The login for a user also specifies which pages, or web addresses that login
 * may view.
 * The password is encrypted when you use the constructor only.
 *
 * @author Jim.Barrows@gmail.com
 * @See The Data Model Resource Book, Revised Edition Volume 2 Figure 2.7 pg 421
 */
@SuppressWarnings("serial")
@Entity
@NamedQueries(@NamedQuery(name = "findByUserId", query = "select ul from UserLogin ul where ul.userId = :userId"))
public class UserLogin extends BasePersistentModel {

	public static final String FIND_BY_USER_ID_QUERY = "findByUserId";
	public static final String USER_ID_PARAM = "userId";

	private boolean active = false;

	@OneToMany(mappedBy = "preferenceFor")
	private Map<String, WebUserPreference> governedBy = new HashMap<String, WebUserPreference>();

	@OneToMany(cascade = CascadeType.ALL)
	@OrderBy(value = "loggedInFrom")
	private List<LoginAccountHistory> having = new ArrayList<LoginAccountHistory>();

	/**
	 * UUID for Party.
	 */
	private UUID loginFor;

	/**
	 * UUID for WebAddress.
	 */
	private UUID loginTo;

	private String password;

	private String salt;

	private String userId;

	public UserLogin(boolean active, Map<String, WebUserPreference> governedBy, List<LoginAccountHistory> having, UUID loginFor, UUID loginTo, String password, String salt, String userId) {
		this.active = active;
		this.governedBy = governedBy;
		this.having = having;
		this.loginFor = loginFor;
		this.loginTo = loginTo;
		this.password = encryptThis( password + salt);
		this.salt = salt;
		this.userId = userId;
	}

	public UserLogin(UUID id, Long version, boolean active, Map<String, WebUserPreference> governedBy, List<LoginAccountHistory> having, UUID loginFor, UUID loginTo, String password, String salt, String userId) {
		super(id, version);
		this.active = active;
		this.governedBy = governedBy;
		this.having = having;
		this.loginFor = loginFor;
		this.loginTo = loginTo;
		this.password = password;
		this.salt = salt;
		this.userId = userId;
	}

	public void addLoginAccountHistory(LoginAccountHistory loginAccountHistory) {
		having.add(loginAccountHistory);
	}

	/**
	 * @return the governedBy
	 */
	public Map<String, WebUserPreference> getGovernedBy() {
		return governedBy;
	}

	/**
	 * @return the having
	 */
	public List<LoginAccountHistory> getHaving() {
		return having;
	}

	@Transient
	public LoginAccountHistory getLastLogin() {
		return having.get(having.size() - 1);
	}

	/**
	 * @return the loginFor
	 */
	public UUID getLoginFor() {
		return loginFor;
	}

	/**
	 * @return the loginTo
	 */
	public UUID getLoginTo() {
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
	public void setGovernedBy(Map<String, WebUserPreference> governedBy) {
		this.governedBy = governedBy;
	}

	/**
	 * @param having the having to set
	 */
	public void setHaving(List<LoginAccountHistory> having) {
		this.having = having;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.setId(id);
	}

	/**
	 * @param loginFor the loginFor to set
	 */
	public void setLoginFor(UUID loginFor) {
		this.loginFor = loginFor;
	}

	/**
	 * @param loginTo the loginTo to set
	 */
	public void setLoginTo(UUID loginTo) {
		this.loginTo = loginTo;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
}
