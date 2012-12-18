package mbmp.party.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import mbmp.model.BaseDateRangeModel;

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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PartyClassification extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party classificationFor;

	/**
	 * @return the classificationFor
	 */
	@NotNull
	@ManyToOne
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