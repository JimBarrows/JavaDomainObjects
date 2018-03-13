package jdo.request.model;

import jdo.model.PersistentEntity;
import jdo.requirement.model.Requirement;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class RequirementRequest extends PersistentEntity {

	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Requirement associatedTo;
	@ManyToOne
	private RequestItem communicatedVia;

	public Requirement getAssociatedTo() {
		return associatedTo;
	}

	public RequestItem getCommunicatedVia() {
		return communicatedVia;
	}

	public void setAssociatedTo(Requirement associatedTo) {
		this.associatedTo = associatedTo;
	}

	public void setCommunicatedVia(RequestItem communicatedVia) {
		this.communicatedVia = communicatedVia;
	}

}
