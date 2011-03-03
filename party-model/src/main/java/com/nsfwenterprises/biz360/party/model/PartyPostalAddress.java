package com.nsfwenterprises.biz360.party.model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.contactmechanism.PostalAddress;

/**
 * Association class between Party and PostalAddress classes, since these could
 * be a many to many relationship, and we might need/want to track address
 * history.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:33 AM
 * @see Data Model Resource Book Volume 1 Figure 2.8, page 50
 */
@SuppressWarnings("serial")
@Entity
public class PartyPostalAddress extends BaseDateRangeModel {	

	private String comment;
	
	private PostalAddress locatedAt;

	private Party specifiedFor;

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof PartyPostalAddress)) {
			return false;
		}
		PartyPostalAddress rhs = (PartyPostalAddress) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.specifiedFor, rhs.specifiedFor).append(this.comment,
				rhs.comment).append(this.locatedAt, rhs.locatedAt).isEquals();
	}

	@NotEmpty
	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public PostalAddress getLocatedAt() {
		return locatedAt;
	}

	@ManyToOne
	public Party getSpecifiedFor() {
		return specifiedFor;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1649912811, 1726898873).appendSuper(
				super.hashCode()).append(this.specifiedFor)
				.append(this.comment).append(this.locatedAt).toHashCode();
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setLocatedAt(PostalAddress locatedAt) {
		this.locatedAt = locatedAt;
	}

	public void setSpecifiedFor(Party specifiedFor) {
		this.specifiedFor = specifiedFor;
	}

}