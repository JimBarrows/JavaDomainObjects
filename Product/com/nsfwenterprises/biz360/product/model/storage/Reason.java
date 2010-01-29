package com.nsfwenterprises.biz360.product.model.storage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class Reason extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String description;

	private List<InventoryItemVariance> explanationFor = new ArrayList<InventoryItemVariance>();

	@NotNull
	@Lob
	public String getDescription() {
		return description;
	}

	@OneToMany
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