package mbmp.ecommerce.model.webvisit;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;

@Entity
public class UserAgent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BrowserType browser;
	
	private UserAgentMethodType methodType;
	
	private PlatformType platform;
	
	private ProtocolType protocolType;
	
	private UserAgentType type;

	@ManyToOne
	public BrowserType getBrowser() {
		return browser;
	}

	@ManyToOne
	public UserAgentMethodType getMethodType() {
		return methodType;
	}

	@ManyToOne
	public PlatformType getPlatform() {
		return platform;
	}

	@ManyToOne
	public ProtocolType getProtocolType() {
		return protocolType;
	}

	@ManyToOne
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
