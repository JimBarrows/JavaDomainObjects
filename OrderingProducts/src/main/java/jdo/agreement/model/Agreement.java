package jdo.agreement.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.hibernate.validator.constraints.NotEmpty;

import jdo.agreement.model.item.AgreementItem;
import jdo.agreement.model.term.AgreementTerm;
import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Agreement extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<Addendum> addendums;

	/**
	 * UUID of the PartyRelationship.
	 * 
	 */
	private UUID associatedWith;

	@Column(name = "agreementDate")
	private Date date;

	@Lob
	private String description;

	/**
	 * List of GeographicBoundary UUIDs this agreement is applicable to.
	 * 
	 */
	@OneToMany
	private List<UUID> geographicalApplicability;

	@OneToMany
	@OrderBy(value = "sequenceId")
	private List<AgreementItem> items;

	@OneToMany
	private List<AgreementRole> roles;

	@OneToMany
	private List<AgreementTerm> terms;

	@Lob
	@NotEmpty
	private String text;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public List<Addendum> getAddendums() {
		return addendums;
	}

	public UUID getAssociatedWith() {
		return associatedWith;
	}

	public Date getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public List<UUID> getGeographicalApplicability() {
		return geographicalApplicability;
	}

	public List<AgreementItem> getItems() {
		return items;
	}

	public List<AgreementRole> getRoles() {
		return roles;
	}

	public List<AgreementTerm> getTerms() {
		return terms;
	}

	public String getText() {
		return text;
	}

	public void setAddendums(List<Addendum> addendums) {
		this.addendums = addendums;
	}

	public void setAssociatedWith(UUID associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGeographicalApplicability(List<UUID> geographicalApplicability) {
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

}
