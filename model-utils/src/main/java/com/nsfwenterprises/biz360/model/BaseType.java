package com.nsfwenterprises.biz360.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.hibernate.validator.constraints.NotEmpty;


/**There are a lot of user definable type, this is the base class for them all.
 * 
 * @author Jim Barrows
 *
 */
@MappedSuperclass
public class BaseType extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty
	@Column(nullable = false, unique=true)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof BaseType)) {
			return false;
		}
		BaseType rhs = (BaseType) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.description, rhs.description)
				.isEquals();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return description;
	}	

}
