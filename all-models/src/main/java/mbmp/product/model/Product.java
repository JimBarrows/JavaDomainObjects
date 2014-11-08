package mbmp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
 

import mbmp.model.BasePersistentModel;
import mbmp.product.model.category.ProductCategoryClassification;
import mbmp.product.model.cost.EstimatedProductCost;
import mbmp.product.model.feature.interaction.ProductFeatureInteraction;
import mbmp.product.model.measurement.UnitOfMeasure;
import mbmp.product.model.part.ProductComponent;
import mbmp.product.model.price.PriceComponent;

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

	private List<ProductObsolescence> aReplacement = new ArrayList<ProductObsolescence>();

	private List<ProductCategoryClassification> categorizedBy = new ArrayList<ProductCategoryClassification>();

	/**
	 * Descriptions and/or notes about the product.
	 * 
	 */
	private String comment;

	private List<ProductComplement> complimentedWith = new ArrayList<ProductComplement>();

	private List<ProductComplement> complimentFor = new ArrayList<ProductComplement>();

	private List<EstimatedProductCost> costedBy = new ArrayList<EstimatedProductCost>();

	private List<ProductIncompatibility> incompatibleWith = new ArrayList<ProductIncompatibility>();

	/**
	 * The date the product was first available to be sold.
	 * 
	 */
	private Date introductionDate;

	private List<ProductComponent> madeUpOf = new ArrayList<ProductComponent>();

	private UnitOfMeasure measuredUsing;

	private String name;

	private List<PriceComponent> pricedBy = new ArrayList<PriceComponent>();

	/**
	 * When the product will not be sold any more.
	 * 
	 */
	private Date salesDiscontinuationDate;

	private List<ProductSubstitute> substitutedBy = new ArrayList<ProductSubstitute>();

	private List<ProductObsolescence> supercededBy = new ArrayList<ProductObsolescence>();

	/**
	 * The date on which the product will no longer be supported by the
	 * enterprise.
	 * 
	 */
	private Date supportDiscontinuationDate;

	private List<ProductSubstitute> usedAs = new ArrayList<ProductSubstitute>();

	private List<ProductComponent> usedIn = new ArrayList<ProductComponent>();

	private List<ProductFeatureInteraction> usedToDefine = new ArrayList<ProductFeatureInteraction>();

	@OneToMany
	public List<ProductObsolescence> getAReplacement() {
		return aReplacement;
	}

	@OneToMany(mappedBy = "categoryFor")
	public List<ProductCategoryClassification> getCategorizedBy() {
		return categorizedBy;
	}

	@Lob
	public String getComment() {
		return comment;
	}

	@OneToMany
	public List<ProductComplement> getComplimentedWith() {
		return complimentedWith;
	}

	@OneToMany
	public List<ProductComplement> getComplimentFor() {
		return complimentFor;
	}

	@OneToMany(mappedBy = "calculatedForProduct")
	public List<EstimatedProductCost> getCostedBy() {
		return costedBy;
	}

	@OneToMany
	public List<ProductIncompatibility> getIncompatibleWith() {
		return incompatibleWith;
	}

	@Temporal(TemporalType.DATE)
	public Date getIntroductionDate() {
		return introductionDate;
	}

	@OneToMany(mappedBy = "in")
	public List<ProductComponent> getMadeUpOf() {
		return madeUpOf;
	}

	@ManyToOne
	public UnitOfMeasure getMeasuredUsing() {
		return measuredUsing;
	}

	@Column(nullable = false, unique = true)
	@NotNull
	public String getName() {
		return name;
	}

	@OneToMany(mappedBy = "priceDefinedForProduct")
	public List<PriceComponent> getPricedBy() {
		return pricedBy;
	}

	@Temporal(TemporalType.DATE)
	public Date getSalesDiscontinuationDate() {
		return salesDiscontinuationDate;
	}

	@OneToMany(mappedBy = "substituteFor")
	public List<ProductSubstitute> getSubstitutedBy() {
		return substitutedBy;
	}

	@OneToMany(mappedBy = "obsolescenceFor")
	public List<ProductObsolescence> getSupercededBy() {
		return supercededBy;
	}

	@Temporal(TemporalType.DATE)
	public Date getSupportDiscontinuationDate() {
		return supportDiscontinuationDate;
	}

	@OneToMany
	public List<ProductSubstitute> getUsedAs() {
		return usedAs;
	}

	@OneToMany(mappedBy = "productFor")
	public List<ProductComponent> getUsedIn() {
		return usedIn;
	}

	@OneToMany
	public List<ProductFeatureInteraction> getUsedToDefine() {
		return usedToDefine;
	}

	public void setAReplacement(List<ProductObsolescence> replacement) {
		aReplacement = replacement;
	}

	public void setCategorizedBy(
			List<ProductCategoryClassification> categorizedBy) {
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

	public void setIncompatibleWith(
			List<ProductIncompatibility> incompatibleWith) {
		this.incompatibleWith = incompatibleWith;
	}

	public void setIntroductionDate(Date introductionDate) {
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

	public void setSalesDiscontinuationDate(Date salesDiscontinuationDate) {
		this.salesDiscontinuationDate = salesDiscontinuationDate;
	}

	public void setSubstitutedBy(List<ProductSubstitute> substitutedBy) {
		this.substitutedBy = substitutedBy;
	}

	public void setSupercededBy(List<ProductObsolescence> supercededBy) {
		this.supercededBy = supercededBy;
	}

	public void setSupportDiscontinuationDate(Date supportDiscontinuationDate) {
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