package jdo.request.model;

import jdo.fields.Money;
import jdo.model.PersistentEntity;
import jdo.requirement.model.Requirement;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

/**
 * This describes the varioud things they need in the request.
 * 
 * @author jim
 *
 */
@Entity
public class RequestItem extends PersistentEntity {

	private static final long serialVersionUID = 1L;
	@OneToMany
	private List<RequirementRequest> communicationMethod;
	@Lob
	private String description;
	@Embedded
	private Money maximumAmount;
	@ManyToOne
	private Requirement partOf;
	@Min(1)
	private int quantity;
	@Temporal(TemporalType.DATE)
	private Date requiredBy;

	public List<RequirementRequest> getCommunicationMethod() {
		return communicationMethod;
	}

	public String getDescription() {
		return description;
	}

	public Money getMaximumAmount() {
		return maximumAmount;
	}

	public Requirement getPartOf() {
		return partOf;
	}

	public int getQuantity() {
		return quantity;
	}

	public Date getRequiredBy() {
		return requiredBy;
	}

	public void setCommunicationMethod(
			List<RequirementRequest> communicationMethod) {
		this.communicationMethod = communicationMethod;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMaximumAmount(Money maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public void setPartOf(Requirement partOf) {
		this.partOf = partOf;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setRequiredBy(Date requiredBy) {
		this.requiredBy = requiredBy;
	}
}
