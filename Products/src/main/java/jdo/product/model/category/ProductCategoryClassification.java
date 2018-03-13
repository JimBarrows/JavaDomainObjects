package jdo.product.model.category;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;
import jdo.product.model.Product;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.crypto.Data;

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
public class ProductCategoryClassification extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@ManyToOne
	private Product				categoryFor;

	@Lob
	@NotEmpty
	private String				comment;

	@ManyToOne
	private ProductCategory		definedBy;

	@Column(name = "primaryProductCategoryClassification")
	private boolean				primary				= false;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public Product getCategoryFor() {
		return categoryFor;
	}

	
	public String getComment() {
		return comment;
	}

	
	public ProductCategory getDefinedBy() {
		return definedBy;
	}

	
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