package mbmp.party.model.geographic_boundary;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import mbmp.party.model.contactmechanism.PostalAddress;
import mbmp.product.model.supplier.ReorderGuideline;
import mbmp.salestax.model.SalesTaxLookup;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * 
 * @author Jim
 * @version 2.0
 * @created 25-Dec-2007 9:54:30 AM
 * @see Data Model Resource Book Volume 1 Figure 2.8, page 50
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class GeographicBoundary {

	private String abbreviation;
	private List<PostalAddress> boundaryFor = new ArrayList<PostalAddress>();
	private String code;
	/**
	 * The list of Geographic Boundaries that are contained inside this one.
	 * 
	 */
	private List<GeographicBoundary> contains = new ArrayList<GeographicBoundary>();
	private String name;
	private GeographicBoundaryType type;

	/**
	 * The list of Geographic Boundaries that contain this one.
	 * 
	 */
	private List<GeographicBoundary> within = new ArrayList<GeographicBoundary>();

	private List<ReorderGuideline> reorderGuideline = new ArrayList<ReorderGuideline>();
	
	private List<SalesTaxLookup> salesTaxLookup = new ArrayList<SalesTaxLookup>();

	@OneToMany
	public List<SalesTaxLookup> getSalesTaxLookup() {
		return salesTaxLookup;
	}

	public void setSalesTaxLookup(List<SalesTaxLookup> salesTaxLookup) {
		this.salesTaxLookup = salesTaxLookup;
	}

	public void setReorderGuideline(List<ReorderGuideline> reorderGuideline) {
		this.reorderGuideline = reorderGuideline;
	}

	/**
	 * This adds the boundary to the contains list, and adds this to the within
	 * list.
	 * 
	 * @param boundary
	 */
	public void add(GeographicBoundary boundary) {
		contains.add(boundary);
		boundary.getWithin().add(this);
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	@ManyToMany
	public List<PostalAddress> getBoundaryFor() {
		return boundaryFor;
	}

	public String getCode() {
		return code;
	}

	@OneToMany
	public List<GeographicBoundary> getContains() {
		return contains;
	}

	@NotEmpty
	public String getName() {
		return name;
	}

	@ManyToOne
	@NotNull
	public GeographicBoundaryType getType() {
		return type;
	}

	@OneToMany
	public List<GeographicBoundary> getWithin() {
		return within;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@OneToMany
	public List<ReorderGuideline> getReorderGuideline() {
		return reorderGuideline;
	}

	public void setReorderGuideline(ReorderGuideline ReorderGuideline) {
		this.reorderGuideline = reorderGuideline;
	}
	public void setBoundaryFor(List<PostalAddress> boundaryFor) {
		this.boundaryFor = boundaryFor;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setContains(List<GeographicBoundary> contains) {
		this.contains = contains;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(GeographicBoundaryType type) {
		this.type = type;
	}

	public void setWithin(List<GeographicBoundary> within) {
		this.within = within;
	}

	protected Long id;

	protected Long version = 0l;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
}
