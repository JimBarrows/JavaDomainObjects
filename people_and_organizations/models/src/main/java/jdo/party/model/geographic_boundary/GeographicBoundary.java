package jdo.party.model.geographic_boundary;

import jdo.model.PersistentEntity;
import jdo.party.model.contactmechanism.PostalAddress;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 
 * @author Jim
 * @version 2.0
 * @created 25-Dec-2007 9:54:30 AM
 * @see Data Model Resource Book Volume 1 Figure 2.8, page 50
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */
@Entity
public class GeographicBoundary extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String abbreviation;
	@ManyToMany
	private List<PostalAddress> boundaryFor = new ArrayList<PostalAddress>();
	private String code;
	/**
	 * The list of Geographic Boundaries that are contained inside this one.
	 * 
	 */
	@OneToMany
	private List<GeographicBoundary> contains = new ArrayList<GeographicBoundary>();
	@NotEmpty
	private String name;
	@ManyToOne
	private GeographicBoundaryType type;

	/**
	 * The list of Geographic Boundaries that contain this one.
	 * 
	 */
	@OneToMany
	private List<GeographicBoundary> within = new ArrayList<GeographicBoundary>();
	/**The list of UUIDs for ReorderGuideline.
	 * 
	 */
	@ElementCollection
	private List<UUID> reorderGuideline = new ArrayList<UUID>();

	/**The list of UUIDs for salesTaxLookup.
	 * 
	 */
	@ElementCollection
	private List<UUID> salesTaxLookup = new ArrayList<UUID>();

	public List<UUID> getSalesTaxLookup() {
		return salesTaxLookup;
	}

	public void setSalesTaxLookup(List<UUID> salesTaxLookup) {
		this.salesTaxLookup = salesTaxLookup;
	}

	public void setReorderGuideline(List<UUID> reorderGuideline) {
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

	public List<PostalAddress> getBoundaryFor() {
		return boundaryFor;
	}

	public String getCode() {
		return code;
	}

	public List<GeographicBoundary> getContains() {
		return contains;
	}

	public String getName() {
		return name;
	}

	public GeographicBoundaryType getType() {
		return type;
	}

	public List<GeographicBoundary> getWithin() {
		return within;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public List<UUID> getReorderGuideline() {
		return reorderGuideline;
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

}
