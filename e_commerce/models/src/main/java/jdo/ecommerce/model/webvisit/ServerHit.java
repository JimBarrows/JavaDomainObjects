package jdo.ecommerce.model.webvisit;

import jdo.ecommerce.model.login.UserLogin;
import jdo.ecommerce.model.webcontent.WebContent;
import jdo.model.BasePersistentModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity
public class ServerHit extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long bytes;

	@ManyToOne
	private UserLogin fromUserLogin;

	@ManyToOne
	private WebContent hitOn;

	/**
	 * UUID of IpAddress.
	 * 
	 */
	private UUID identifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date occuredOn;

	@ManyToOne
	private Visit partOf;

	/**
	 * UUId of WebAddress.
	 * 
	 */
	private UUID referredVia;

	@ManyToOne
	private ServerHitStatusType status;

	@ManyToOne
	private UserAgent userAgent;

	public long getBytes() {
		return bytes;
	}

	public UserLogin getFromUserLogin() {
		return fromUserLogin;
	}

	public WebContent getHitOn() {
		return hitOn;
	}

	public UUID getIdentifiedBy() {
		return identifiedBy;
	}

	public Date getOccuredOn() {
		return occuredOn;
	}

	public Visit getPartOf() {
		return partOf;
	}

	public UUID getReferredVia() {
		return referredVia;
	}

	public ServerHitStatusType getStatus() {
		return status;
	}

	public UserAgent getUserAgent() {
		return userAgent;
	}

	public void setBytes(long bytes) {
		this.bytes = bytes;
	}

	public void setFromUserLogin(UserLogin fromUserLogin) {
		this.fromUserLogin = fromUserLogin;
	}

	public void setHitOn(WebContent hitOn) {
		this.hitOn = hitOn;
	}

	public void setIdentifiedBy(UUID identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	public void setOccuredOn(Date occuredOn) {
		this.occuredOn = occuredOn;
	}

	public void setPartOf(Visit partOf) {
		this.partOf = partOf;
	}

	public void setReferredVia(UUID referredVia) {
		this.referredVia = referredVia;
	}

	public void setStatus(ServerHitStatusType status) {
		this.status = status;
	}

	public void setUserAgent(UserAgent userAgent) {
		this.userAgent = userAgent;
	}

}
