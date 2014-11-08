package jdo.agreement.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.validation.constraints.NotNull;

import jdo.agreement.model.item.AgreementItem;
import jdo.agreement.model.term.AgreementTerm;
import jdo.model.BaseDateRangeModel;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.party.model.relationship.PartyRelationship;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Agreement extends BaseDateRangeModel {

	private static final long serialVersionUID = 1L;
	
	private List<Addendum> addendums;
	
	private PartyRelationship associatedWith;
	
	private Date date;
	
	private String description;
	
	private List<GeographicBoundary> geographicalApplicability;
	
	private List<AgreementItem> items;
	
	private List<AgreementRole> roles;
	
	private List<AgreementTerm> terms;
	
	private String text;
	
	private AgreementType type;

	@OneToMany
	public List<Addendum> getAddendums() {
		return addendums;
	}

	@ManyToOne
	public PartyRelationship getAssociatedWith() {
		return associatedWith;
	}

	@Column(name="agreementDate")
	public Date getDate() {
		return date;
	}

	@Lob
	public String getDescription() {
		return description;
	}

	@OneToMany
	public List<GeographicBoundary> getGeographicalApplicability() {
		return geographicalApplicability;
	}

	@OneToMany
	@OrderBy(value="sequenceId")
	public List<AgreementItem> getItems() {
		return items;
	}

	@OneToMany
	public List<AgreementRole> getRoles() {
		return roles;
	}

	@OneToMany
	public List<AgreementTerm> getTerms() {
		return terms;
	}

	@Lob
	@NotEmpty
	public String getText() {
		return text;
	}

	@NotNull
	public AgreementType getType() {
		return type;
	}

	public void setAddendums(List<Addendum> addendums) {
		this.addendums = addendums;
	}

	public void setAssociatedWith(PartyRelationship associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGeographicalApplicability(
			List<GeographicBoundary> geographicalApplicability) {
		this.geographicalApplicability = geographicalApplicability;
	}

	public void setItems(List<AgreementItem> items) {
		this.items = items;
	}

	public void setRoles(List<AgreementRole> roles) {
		this.roles = roles;
	}

	public void setTerms(List<AgreementTerm> terms) {
		this.terms = terms;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setType(AgreementType type) {
		this.type = type;
	}

}
