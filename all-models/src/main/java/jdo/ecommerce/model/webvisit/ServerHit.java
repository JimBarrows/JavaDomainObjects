package jdo.ecommerce.model.webvisit;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.ecommerce.model.login.UserLogin;
import jdo.ecommerce.model.webcontent.WebContent;
import jdo.model.BasePersistentModel;
import jdo.party.model.contactmechanism.IpAddress;
import jdo.party.model.contactmechanism.WebAddress;

@Entity
public class ServerHit extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private long								bytes;

	@ManyToOne
	private UserLogin						fromUserLogin;

	@ManyToOne
	private WebContent					hitOn;

	@ManyToOne
	private IpAddress						identifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date								occuredOn;

	@ManyToOne
	private Visit								partOf;

	@ManyToOne
	private WebAddress					referredVia;

	@ManyToOne
	private ServerHitStatusType	status;

	@ManyToOne
	private UserAgent						userAgent;

	public long getBytes() {
		return bytes;
	}

	public UserLogin getFromUserLogin() {
		return fromUserLogin;
	}

	public WebContent getHitOn() {
		return hitOn;
	}

	public IpAddress getIdentifiedBy() {
		return identifiedBy;
	}

	public Date getOccuredOn() {
		return occuredOn;
	}

	public Visit getPartOf() {
		return partOf;
	}

	public WebAddress getReferredVia() {
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
