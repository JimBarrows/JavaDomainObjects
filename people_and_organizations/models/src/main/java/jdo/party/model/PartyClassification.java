package jdo.party.model;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

/**
 * Represents 1 or more classification to which a party may belong. The actual
 * classifications are kept in the PartyType class. The classifications can then
 * be used to determine if there are any special business considerations for
 * parties, such as pricing, terms, and market segments.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:32 AM
 * @see Data Model Resource Book Volume 1 Figure 2.3, page 30
 * @see Data Model Resource Book Volume 1 Figure 3.2, page 73
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PartyClassification extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@NotNull
	@ManyToOne
	private Party				classificationFor;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	/**
	 * @return the classificationFor
	 */
	
	public Party getClassificationFor() {
		return classificationFor;
	}

	/**
	 * @param classificationFor
	 *            the classificationFor to set
	 */
	public void setClassificationFor(Party classificationFor) {
		this.classificationFor = classificationFor;
	}

}