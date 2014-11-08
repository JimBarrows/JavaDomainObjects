package jdo.request.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.requirement.model.Requirement;

/**This describes the varioud things they need in the request.
 * 
 * @author jim
 *
 */
@Entity
public class RequestItem  extends BasePersistentModel{

	private static final long serialVersionUID = 1L;
	
	private List<RequirementRequest> communicationMethod;
	
	private String description;

	private BigDecimal maximumAmount;
	
	private Requirement partOf;
	
	private int quantity;
	
	private Date requiredBy;
	
	@OneToMany
	public List<RequirementRequest> getCommunicationMethod() {
		return communicationMethod;
	}
	@Lob
	public String getDescription() {
		return description;
	}
	
	public BigDecimal getMaximumAmount() {
		return maximumAmount;
	}
	@ManyToOne
	public Requirement getPartOf() {
		return partOf;
	}
	
	@Min(1)
	public int getQuantity() {
		return quantity;
	}
	@Temporal(TemporalType.DATE)
	public Date getRequiredBy() {
		return requiredBy;
	}
	
	public void setCommunicationMethod(List<RequirementRequest> communicationMethod) {
		this.communicationMethod = communicationMethod;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setMaximumAmount(BigDecimal maximumAmount) {
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
