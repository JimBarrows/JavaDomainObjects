package jdo.workeffort.requirement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;

@Entity
public class Deliverable extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String description;

	private String name;
	@OneToMany
	private List<WorkRequirement> producedBy = new ArrayList<WorkRequirement>();

	@ManyToOne
	private DeliverableType type;

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public List<WorkRequirement> getProducedBy() {
		return producedBy;
	}

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
