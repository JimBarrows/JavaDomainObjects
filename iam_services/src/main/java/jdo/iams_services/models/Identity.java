package jdo.iams_services.models;

import jdo.model.PersistentEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static jdo.encryption.Encrypter.encrypt;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

/**
 * The username, password and authorization list for a party that can use the main system.  If you use setPassword, then the password will not be encrypted,
 * instead use the constructor and the password will be encrypted.
 */
@Entity
public class Identity extends PersistentEntity {
	private boolean active = false;
	private List<Authorization> authorizations = new ArrayList<>();
	private UUID identityOfParty;
	private String password = "";
	private String salt = "";
	private String username = "";


	public Identity() {
		super();
	}

	/**
	 * @param identityOfParty
	 * @param password
	 * @param salt
	 * @param username
	 * @param authorizations
	 */
	public Identity(UUID identityOfParty, String password, String salt, String username, List<Authorization> authorizations) {
		assert identityOfParty != null : "identityOfParty cannot be null";
		assert isNotEmpty(password) : "password cannot be empty";
		assert isNotEmpty(salt) : "salt cannot be empty";
		assert isNotEmpty(username) : "username cannot be empty";
		this.identityOfParty = identityOfParty;
		this.password = encrypt(password + salt);
		this.salt = salt;
		this.username = username;
		this.authorizations = authorizations;
		this.active = true;
	}

	@NotEmpty
	@Length(min = 16, max = 250)
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}


	public List<Authorization> activeAuthorizations() {
		return getAuthorizations().stream().filter(authorization -> authorization.isActive()).collect(Collectors.toList());
	}

	@OneToMany
	public List<Authorization> getAuthorizations() {
		return authorizations;
	}

	public void setAuthorizations(List<Authorization> authorizations) {
		this.authorizations = authorizations;
	}

	@NotNull
	public UUID getIdentityOfParty() {
		return identityOfParty;
	}

	public void setIdentityOfParty(UUID identityOfParty) {
		this.identityOfParty = identityOfParty;
	}

	@NotEmpty
	@Length(min = 8, max = 250)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotEmpty
	@Length(min = 2, max = 250)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("active", active)
				.append("authorizations", authorizations)
				.append("identityOfParty", identityOfParty)
				.append("password", isEmpty(password) ? "-" : "########")
				.append("salt", salt)
				.append("username", username)
				.toString();
	}
}

