package jdo.ecommerce.model.webvisit;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;
import jdo.order.model.Order;
import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.WebAddress;

@Entity
public class Visit extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private List<ServerHit>		composedOf;

	private String				cookie;

	private WebAddress			hostedVia;

	private Order				resultingIn;

	private PartyRole			visitedBy;

	private Date				visitEnd;

	private Date				visitStart;

	@OneToMany
	public List<ServerHit> getComposedOf() {
		return composedOf;
	}

	public String getCookie() {
		return cookie;
	}

	@ManyToOne
	public WebAddress getHostedVia() {
		return hostedVia;
	}

	@ManyToOne
	public Order getResultingIn() {
		return resultingIn;
	}

	@ManyToOne
	public PartyRole getVisitedBy() {
		return visitedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getVisitEnd() {
		return visitEnd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getVisitStart() {
		return visitStart;
	}

	public void setComposedOf(List<ServerHit> composedOf) {
		this.composedOf = composedOf;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public void setHostedVia(WebAddress hostedVia) {
		this.hostedVia = hostedVia;
	}

	public void setResultingIn(Order resultingIn) {
		this.resultingIn = resultingIn;
	}

	public void setVisitedBy(PartyRole visitedBy) {
		this.visitedBy = visitedBy;
	}

	public void setVisitEnd(Date visitEnd) {
		this.visitEnd = visitEnd;
	}

	public void setVisitStart(Date visitStart) {
		this.visitStart = visitStart;
	}

}
