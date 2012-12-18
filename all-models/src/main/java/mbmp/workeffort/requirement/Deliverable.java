package mbmp.workeffort.requirement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import mbmp.model.BasePersistentModel;

@Entity
public class Deliverable extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;
	
	private String name;
	
	private List<WorkRequirement> producedBy = new ArrayList<WorkRequirement>();
	
	private DeliverableType type;
	
	@Lob
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}

	@OneToMany
	public List<WorkRequirement> getProducedBy() {
		return producedBy;
	}

	@ManyToOne
	public DeliverableType getType() {
		return type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setProducedBy(List<WorkRequirement> producedBy) {
		this.producedBy = producedBy;
	}
	
	public void setType(DeliverableType type) {
		this.type = type;
	}

}
