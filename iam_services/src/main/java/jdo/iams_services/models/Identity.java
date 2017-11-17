package jdo.iams_services.models;

import jdo.encryption.Encrypter;
import jdo.iams_services.models.Authorization;
import jdo.model.BasePersistentModel;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static jdo.encryption.Encrypter.encryptThis;

/**
 * The username, password and authorization list for a party that can use the main system.  If you use setPassword, then the password will not be encrypted,
 * instead use the constructor and the password will be encrypted.
 */
@Entity
public class Identity extends BasePersistentModel {
	private UUID identityOfParty;
	private String password;
	private String salt;

	public Identity() {
		super();
	}

	public Identity(UUID identityOfParty, String password, String salt, String username, List<Authorization> authorizations) {
		this.identityOfParty = identityOfParty;
		this.password = encryptThis(password + salt);
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

	private String username;
	private List<Authorization> authorizations;

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

	private boolean active;
}

