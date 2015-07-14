package jdo.ecommerce.model.webvisit;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

@Entity
public class Visit extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<ServerHit> composedOf;

	private String cookie;

	/**
	 * UUID of WebAddress.
	 * 
	 */
	private UUID hostedVia;

	/**
	 * UUID of Order.
	 * 
	 */
	private UUID resultingIn;

	/**
	 * UUId of PartyRole.
	 * 
	 */
	private UUID visitedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date visitEnd;

	@Temporal(TemporalType.TIMESTAMP)
	private Date visitStart;

	public List<ServerHit> getComposedOf() {
		return composedOf;
	}

	public String getCookie() {
		return cookie;
	}

	public UUID getHostedVia() {
		return hostedVia;
	}

	public UUID getResultingIn() {
		return resultingIn;
	}

	public UUID getVisitedBy() {
		return visitedBy;
	}

	public Date getVisitEnd() {
		return visitEnd;
	}

	public Date getVisitStart() {
		return visitStart;
	}

	public void setComposedOf(List<ServerHit> composedOf) {
		this.composedOf = composedOf;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public void setHostedVia(UUID hostedVia) {
		this.hostedVia = hostedVia;
	}

	public void setResultingIn(UUID resultingIn) {
		this.resultingIn = resultingIn;
	}

	public void setVisitedBy(UUID visitedBy) {
		this.visitedBy = visitedBy;
	}

	public void setVisitEnd(Date visitEnd) {
		this.visitEnd = visitEnd;
	}

	public void setVisitStart(Date visitStart) {
		this.visitStart = visitStart;
	}

}
