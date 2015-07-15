package jdo.party.model.contactmechanism;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Responsible for maintaining information about the username, and protocol used
 * to contact someone via an instant message service.
 * 
 * @author jim
 * 
 */
@SuppressWarnings("serial")
@Entity
public class InstantMessaging extends ContactMechanism {

	@NotEmpty
	private String protocol;

	@NotEmpty
	private String username;

	public String getProtocol() {
		return protocol;
	}

	public String getUsername() {
		return username;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
