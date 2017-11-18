package jdo.agreement.model;

import jdo.model.PersistentEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Addendum extends PersistentEntity {

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
