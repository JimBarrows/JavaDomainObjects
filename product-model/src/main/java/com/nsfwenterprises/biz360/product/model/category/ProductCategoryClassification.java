package com.nsfwenterprises.biz360.product.model.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.product.model.Product;

/**
 * The actual category a product is in, as well as the time it was in it. Since
 * a classification may change over time, we can set date ranges for the
 * duration of the classification.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:35 AM
 * @see Data Model Resource Book Volume 1 Figure 3.2, page 73
 */

@Entity
public class ProductCategoryClassification extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Product categoryFor;

	private String comment;

	private ProductCategory definedBy;

	private boolean primary = false;

	@ManyToOne
	public Product getCategoryFor() {
		return categoryFor;
	}

	@Lob
	@NotNull
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public ProductCategory getDefinedBy() {
		return definedBy;
	}

	@Column(name = "primaryProductCategoryClassification")
	public boolean isPrimary() {
		return primary;
	}

	public void setCategoryFor(Product categoryFor) {
		this.categoryFor = categoryFor;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDefinedBy(ProductCategory definedBy) {
		this.definedBy = definedBy;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

}