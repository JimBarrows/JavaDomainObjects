package jdo.request.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.requirement.model.Requirement;

@Entity
public class RequirementRequest extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	private Requirement associatedTo;
	
	private RequestItem communicatedVia;

	@ManyToOne
	public Requirement getAssociatedTo() {
		return associatedTo;
	}

	@ManyToOne
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