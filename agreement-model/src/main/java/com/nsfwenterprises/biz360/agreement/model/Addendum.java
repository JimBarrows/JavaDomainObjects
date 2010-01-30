package com.nsfwenterprises.biz360.agreement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class Addendum extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date creationDate;
	private Date effectiveDate;
	private String text;

	@Temporal(TemporalType.DATE)
	@NotNull
	public Date getCreationDate() {
		return creationDate;
	}
	
	@Temporal(TemporalType.DATE)
	@NotNull
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	@Lob
	@NotEmpty
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