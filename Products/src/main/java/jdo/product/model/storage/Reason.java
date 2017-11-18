package jdo.product.model.storage;

import jdo.model.PersistentEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class Reason extends PersistentEntity {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@NotEmpty
	@Lob
	private String						description;

	@OneToMany
	private List<InventoryItemVariance>	explanationFor		= new ArrayList<InventoryItemVariance>();

	
	public String getDescription() {
		return description;
	}

	
	public List<InventoryItemVariance> getExplanationFor() {
		return explanationFor;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setExplanationFor(List<InventoryItemVariance> explanationFor) {
		this.explanationFor = explanationFor;
	}

}