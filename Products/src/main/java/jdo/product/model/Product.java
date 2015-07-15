package jdo.product.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

import org.hibernate.validator.constraints.NotEmpty;

import jdo.model.BasePersistentModel;
import jdo.product.model.category.ProductCategoryClassification;
import jdo.product.model.cost.EstimatedProductCost;
import jdo.product.model.feature.interaction.ProductFeatureInteraction;
import jdo.product.model.measurement.UnitOfMeasure;
import jdo.product.model.part.ProductComponent;
import jdo.product.model.price.PriceComponent;

/**
 * Models all products the enterprise sells, products from suppliers, and
 * competitor's products.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:35 AM
 * @see Data Model Resource Book Volume 1 Figure 3.1, page 71
 * @see Data Model Resource Book Volume 1 Figure 3.2, page 73
 * @see Data Model Resource Book Volume 1 Figure 3.3, page 75
 * @see Data Model Resource Book Volume 1 Figure 3.4, page 77
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Product extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<ProductObsolescence> aReplacement = new ArrayList<ProductObsolescence>();

	@OneToMany(mappedBy = "categoryFor")
	private List<ProductCategoryClassification> categorizedBy = new ArrayList<ProductCategoryClassification>();

	/**
	 * Descriptions and/or notes about the product.
	 * 
	 */
	@Lob
	private String comment;

	@OneToMany
	private List<ProductComplement> complimentedWith = new ArrayList<ProductComplement>();

	@OneToMany
	private List<ProductComplement> complimentFor = new ArrayList<ProductComplement>();

	@OneToMany(mappedBy = "calculatedForProduct")
	private List<EstimatedProductCost> costedBy = new ArrayList<EstimatedProductCost>();

	@OneToMany
	private List<ProductIncompatibility> incompatibleWith = new ArrayList<ProductIncompatibility>();

	/**
	 * The date the product was first available to be sold.
	 * 
	 */
	private LocalDate introductionDate;

	@OneToMany(mappedBy = "in")
	private List<ProductComponent> madeUpOf = new ArrayList<ProductComponent>();

	@ManyToOne
	private UnitOfMeasure measuredUsing;

	@Column(nullable = false, unique = true)
	@NotEmpty
	private String name;

	@OneToMany(mappedBy = "priceDefinedForProduct")
	private List<PriceComponent> pricedBy = new ArrayList<PriceComponent>();

	/**
	 * When the product will not be sold any more.
	 * 
	 */
	private LocalDate salesDiscontinuationDate;

	@OneToMany(mappedBy = "substituteFor")
	private List<ProductSubstitute> substitutedBy = new ArrayList<ProductSubstitute>();

	@OneToMany(mappedBy = "obsolescenceFor")
	private List<ProductObsolescence> supercededBy = new ArrayList<ProductObsolescence>();

	/**
	 * The date on which the product will no longer be supported by the
	 * enterprise.
	 * 
	 */
	private LocalDate supportDiscontinuationDate;

	@OneToMany
	private List<ProductSubstitute> usedAs = new ArrayList<ProductSubstitute>();

	@OneToMany(mappedBy = "productFor")
	private List<ProductComponent> usedIn = new ArrayList<ProductComponent>();

	@OneToMany
	private List<ProductFeatureInteraction> usedToDefine = new ArrayList<ProductFeatureInteraction>();

	public boolean isAvailable() {
		return isIntroduced() && !isDiscontinued();
	}

	public boolean isIntroduced() {
		return (introductionDate != null) && introductionDate.isBefore(LocalDate.now());
	}

	public boolean isDiscontinued() {
		return (salesDiscontinuationDate != null) && salesDiscontinuationDate.isBefore(LocalDate.now());
	}

	public List<ProductObsolescence> getAReplacement() {
		return aReplacement;
	}

	public List<ProductCategoryClassification> getCategorizedBy() {
		return categorizedBy;
	}

	public String getComment() {
		return comment;
	}

	public List<ProductComplement> getComplimentedWith() {
		return complimentedWith;
	}

	public List<ProductComplement> getComplimentFor() {
		return complimentFor;
	}

	public List<EstimatedProductCost> getCostedBy() {
		return costedBy;
	}

	public List<ProductIncompatibility> getIncompatibleWith() {
		return incompatibleWith;
	}

	public LocalDate getIntroductionDate() {
		return introductionDate;
	}

	public List<ProductComponent> getMadeUpOf() {
		return madeUpOf;
	}

	public UnitOfMeasure getMeasuredUsing() {
		return measuredUsing;
	}

	public String getName() {
		return name;
	}

	public List<PriceComponent> getPricedBy() {
		return pricedBy;
	}

	public LocalDate getSalesDiscontinuationDate() {
		return salesDiscontinuationDate;
	}

	public List<ProductSubstitute> getSubstitutedBy() {
		return substitutedBy;
	}

	public List<ProductObsolescence> getSupercededBy() {
		return supercededBy;
	}

	public LocalDate getSupportDiscontinuationDate() {
		return supportDiscontinuationDate;
	}

	public List<ProductSubstitute> getUsedAs() {
		return usedAs;
	}

	public List<ProductComponent> getUsedIn() {
		return usedIn;
	}

	public List<ProductFeatureInteraction> getUsedToDefine() {
		return usedToDefine;
	}

	public void setAReplacement(List<ProductObsolescence> replacement) {
		aReplacement = replacement;
	}

	public void setCategorizedBy(List<ProductCategoryClassification> categorizedBy) {
		this.categorizedBy = categorizedBy;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setComplimentedWith(List<ProductComplement> complimentedWith) {
		this.complimentedWith = complimentedWith;
	}

	public void setComplimentFor(List<ProductComplement> complimentFor) {
		this.complimentFor = complimentFor;
	}

	public void setCostedBy(List<EstimatedProductCost> costedBy) {
		this.costedBy = costedBy;
	}

	public void setIncompatibleWith(List<ProductIncompatibility> incompatibleWith) {
		this.incompatibleWith = incompatibleWith;
	}

	public void setIntroductionDate(LocalDate introductionDate) {
		this.introductionDate = introductionDate;
	}

	public void setMadeUpOf(List<ProductComponent> madeUpOf) {
		this.madeUpOf = madeUpOf;
	}

	public void setMeasuredUsing(UnitOfMeasure measuredUsing) {
		this.measuredUsing = measuredUsing;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPricedBy(List<PriceComponent> pricedBy) {
		this.pricedBy = pricedBy;
	}

	public void setSalesDiscontinuationDate(LocalDate salesDiscontinuationDate) {
		this.salesDiscontinuationDate = salesDiscontinuationDate;
	}

	public void setSubstitutedBy(List<ProductSubstitute> substitutedBy) {
		this.substitutedBy = substitutedBy;
	}

	public void setSupercededBy(List<ProductObsolescence> supercededBy) {
		this.supercededBy = supercededBy;
	}

	public void setSupportDiscontinuationDate(LocalDate supportDiscontinuationDate) {
		this.supportDiscontinuationDate = supportDiscontinuationDate;
	}

	public void setUsedAs(List<ProductSubstitute> usedAs) {
		this.usedAs = usedAs;
	}

	public void setUsedIn(List<ProductComponent> usedIn) {
		this.usedIn = usedIn;
	}

	public void setUsedToDefine(List<ProductFeatureInteraction> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}

}