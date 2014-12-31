package jdo.agreement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Addendum extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date				creationDate;
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date				effectiveDate;
	@Lob
	@NotEmpty
	private String				text;

	
	public Date getCreationDate() {
		return creationDate;
	}

	
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	
	public String getText() {
		return text;
	}

	@Transient
	public boolean isEffective() {
		return effectiveDate.equals(new Date()) || effectiveDate.before(new Date());
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public void setText(String text) {
		this.text = text;
	}
}
