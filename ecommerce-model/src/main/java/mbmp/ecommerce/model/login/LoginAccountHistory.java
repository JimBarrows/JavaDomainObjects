package mbmp.ecommerce.model.login;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import mbmp.model.BasePersistentModel;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Keep track of when every user logs in,and when they logged out, and what
 * userId and password they used at the time.
 * 
 * @author Jim.Barrows@gmail.com
 * 
 */
@SuppressWarnings("serial")
@Entity
public class LoginAccountHistory extends BasePersistentModel{

	private Date loggedInFrom;
	
	private Date loggedInThru;
	
	private String password;
	
	private String userId;

	public LoginAccountHistory() {
		
	}
	
	public LoginAccountHistory( Date from,String userId, String password) {
		setLoggedInFrom(from);
		setUserId(userId);
		setPassword(password);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		final LoginAccountHistory other = (LoginAccountHistory) obj;
		if (loggedInFrom == null) {
			if (other.loggedInFrom != null)
				return false;
		} else if (!loggedInFrom.equals(other.loggedInFrom))
			return false;
		if (loggedInThru == null) {
			if (other.loggedInThru != null)
				return false;
		} else if (!loggedInThru.equals(other.loggedInThru))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	/**
	 * @return the from
	 */
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLoggedInFrom() {
		return loggedInFrom;
	}

	/**
	 * @return the thru
	 */
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLoggedInThru() {
		return loggedInThru;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((loggedInFrom == null) ? 0 : loggedInFrom.hashCode());
		result = prime * result
				+ ((loggedInThru == null) ? 0 : loggedInThru.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	/**
	 * @param from
	 *            the from to set
	 */
	public void setLoggedInFrom(Date from) {
		this.loggedInFrom = from;
	}

	/**
	 * @param thru
	 *            the thru to set
	 */
	public void setLoggedInThru(Date thru) {
		this.loggedInThru = thru;
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
}
