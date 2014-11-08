package jdo.ecommerce.model.webvisit;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.ecommerce.model.login.UserLogin;
import jdo.ecommerce.model.party.contactmechanism.IpAddress;
import jdo.ecommerce.model.party.contactmechanism.WebAddress;
import jdo.ecommerce.model.webcontent.WebContent;
import jdo.model.BasePersistentModel;

@Entity
public class ServerHit extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long bytes;
	
	private UserLogin fromUserLogin;
	
	private WebContent hitOn;
	
	private IpAddress identifiedBy;
	
	private Date occuredOn;
	
	private Visit partOf;
	
	private WebAddress referredVia;
	
	private ServerHitStatusType status;
	
	private UserAgent userAgent;

	public long getBytes() {
		return bytes;
	}

	@ManyToOne
	public UserLogin getFromUserLogin() {
		return fromUserLogin;
	}

	@ManyToOne
	public WebContent getHitOn() {
		return hitOn;
	}

	@ManyToOne
	public IpAddress getIdentifiedBy() {
		return identifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getOccuredOn() {
		return occuredOn;
	}

	@ManyToOne
	public Visit getPartOf() {
		return partOf;
	}

	@ManyToOne
	public WebAddress getReferredVia() {
		return referredVia;
	}

	@ManyToOne
	public ServerHitStatusType getStatus() {
		return status;
	}

	@ManyToOne
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

	public void setIdentifiedBy(IpAddress identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	public void setOccuredOn(Date occuredOn) {
		this.occuredOn = occuredOn;
	}

	public void setPartOf(Visit partOf) {
		this.partOf = partOf;
	}

	public void setReferredVia(WebAddress referredVia) {
		this.referredVia = referredVia;
	}

	public void setStatus(ServerHitStatusType status) {
		this.status = status;
	}

	public void setUserAgent(UserAgent userAgent) {
		this.userAgent = userAgent;
	}

}
