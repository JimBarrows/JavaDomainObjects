package jdo.agreement.model.item;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

import jdo.agreement.model.Addendum;
import jdo.agreement.model.Agreement;
import jdo.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AgreementItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<Addendum> addendums;

	@OneToMany
	private List<AgreementItem> composedOf;

	/**
	 * List of GeographicBoundary UUIDs.
	 * 
	 */
	@ElementCollection
	private List<UUID> geographicBoundaries;

	private String image;

	/**
	 * List of Organization UUIDs.
	 * 
	 */
	@ElementCollection
	private List<UUID> organizations;

	@ManyToOne
	private Agreement partOf;

	/** List of Product UUIDs. */
	@ElementCollection
	private List<UUID> products;

	@Min(1)
	private int sequenceId;

	@Lob
	@Column(name = "agreementtext")
	private String text;

	public List<Addendum> getAddendums() {
		return addendums;
	}

	public List<AgreementItem> getComposedOf() {
		return composedOf;
	}

	public List<UUID> getGeographicBoundaries() {
		return geographicBoundaries;
	}

	public String getImage() {
		return image;
	}

	public List<UUID> getOrganizations() {
		return organizations;
	}

	public Agreement getPartOf() {
		return partOf;
	}

	public List<UUID> getProducts() {
		return products;
	}

	public int getSequenceId() {
		return sequenceId;
	}

	public String getText() {
		return text;
	}

	public void setAddendums(List<Addendum> addendums) {
		this.addendums = addendums;
	}

	public void setComposedOf(List<AgreementItem> composedOf) {
		this.composedOf = composedOf;
	}

	public void setGeographicBoundaries(List<UUID> geographicBoundaries) {
		this.geographicBoundaries = geographicBoundaries;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setOrganizations(List<UUID> organizations) {
		this.organizations = organizations;
	}

	public void setPartOf(Agreement partOf) {
		this.partOf = partOf;
	}

	public void setProducts(List<UUID> products) {
		this.products = products;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public void setText(String text) {
		this.text = text;
	}

}
