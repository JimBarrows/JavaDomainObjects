package com.nsfwenterprises.biz360.agreement.model.item;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.product.model.Product;
import org.hibernate.validator.Min;

import com.nsfwenterprises.biz360.agreement.model.Addendum;
import com.nsfwenterprises.biz360.agreement.model.Agreement;
import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.geographicBoundary.GeographicBoundary;

@Entity
public class AgreementItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Addendum> addendums;
	
	private List<AgreementItem> composedOf;
	
	private List<GeographicBoundary> geographicBoundaries;
	
	private String image;
	
	private List<Organization> organizations;
	
	private Agreement partOf;
	
	private List<Product> products;
	
	private int sequenceId;
	
	private String text;

	@OneToMany
	public List<Addendum> getAddendums() {
		return addendums;
	}

	@OneToMany
	public List<AgreementItem> getComposedOf() {
		return composedOf;
	}

	@OneToMany
	public List<GeographicBoundary> getGeographicBoundaries() {
		return geographicBoundaries;
	}

	public String getImage() {
		return image;
	}

	@OneToMany
	public List<Organization> getOrganizations() {
		return organizations;
	}

	@ManyToOne
	public Agreement getPartOf() {
		return partOf;
	}

	@OneToMany
	public List<Product> getProducts() {
		return products;
	}

	@Min(1)
	public int getSequenceId() {
		return sequenceId;
	}

	@Lob
	public String getText() {
		return text;
	}

	public void setAddendums(List<Addendum> addendums) {
		this.addendums = addendums;
	}

	public void setComposedOf(List<AgreementItem> composedOf) {
		this.composedOf = composedOf;
	}

	public void setGeographicBoundaries(
			List<GeographicBoundary> geographicBoundaries) {
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
