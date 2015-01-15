package jdo.agreement.model.item;

import java.util.List;

import javax.persistence.Column;
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
import jdo.party.model.Organization;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AgreementItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@OneToMany
	private List<Addendum>				addendums;

	@OneToMany
	private List<AgreementItem>			composedOf;

	@OneToMany
	private List<GeographicBoundary>	geographicBoundaries;

	private String						image;

	@OneToMany
	private List<Organization>			organizations;

	@ManyToOne
	private Agreement					partOf;

	@OneToMany
	private List<Product>				products;

	@Min(1)
	private int							sequenceId;

	@Lob
	@Column(name="agreementtext")
	private String						text;
	
	public List<Addendum> getAddendums() {
		return addendums;
	}
	
	public List<AgreementItem> getComposedOf() {
		return composedOf;
	}

	public List<GeographicBoundary> getGeographicBoundaries() {
		return geographicBoundaries;
	}

	public String getImage() {
		return image;
	}

	public List<Organization> getOrganizations() {
		return organizations;
	}


	public Agreement getPartOf() {
		return partOf;
	}
	
	public List<Product> getProducts() {
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

	public void setGeographicBoundaries(List<GeographicBoundary> geographicBoundaries) {
		this.geographicBoundaries = geographicBoundaries;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;
	}

	public void setPartOf(Agreement partOf) {
		this.partOf = partOf;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public void setText(String text) {
		this.text = text;
	}

}
