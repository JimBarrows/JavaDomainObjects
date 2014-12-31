package jdo.ecommerce.model.webvisit;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class UserAgent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@ManyToOne
	private BrowserType					browser;

	@ManyToOne
	private UserAgentMethodType	methodType;

	@ManyToOne
	private PlatformType				platform;

	@ManyToOne
	private ProtocolType				protocolType;

	@ManyToOne
	private UserAgentType				type;

	public BrowserType getBrowser() {
		return browser;
	}

	public UserAgentMethodType getMethodType() {
		return methodType;
	}

	public PlatformType getPlatform() {
		return platform;
	}

	public ProtocolType getProtocolType() {
		return protocolType;
	}

	public UserAgentType getType() {
		return type;
	}

	public void setBrowser(BrowserType browser) {
		this.browser = browser;
	}

	public void setMethodType(UserAgentMethodType methodType) {
		this.methodType = methodType;
	}

	public void setPlatform(PlatformType platform) {
		this.platform = platform;
	}

	public void setProtocolType(ProtocolType protocolType) {
		this.protocolType = protocolType;
	}

	public void setType(UserAgentType type) {
		this.type = type;
	}

}
