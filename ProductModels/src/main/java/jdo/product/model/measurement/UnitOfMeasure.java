package jdo.product.model.measurement;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

import jdo.model.BasePersistentModel;
import jdo.product.model.Product;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:39 AM
 * @see Data Model Resource Book Volume 1 Figure 3.4, page 77
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UnitOfMeasure extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long				serialVersionUID	= 1L;

	private String							abbreviation;
	@OneToMany
	private List<UnitOfMeasureConversion>	convertedFrom;
	@OneToMany
	private List<UnitOfMeasureConversion>	convertedTo;
	@NotEmpty
	@Lob
	private String							description;
	@OneToMany(mappedBy = "measuredUsing")
	private List<Product>					usedIn;

	public String getAbbreviation() {
		return abbreviation;
	}

	
	public List<UnitOfMeasureConversion> getConvertedFrom() {
		return convertedFrom;
	}

	
	public List<UnitOfMeasureConversion> getConvertedTo() {
		return convertedTo;
	}

	
	public String getDescription() {
		return description;
	}

	
	public List<Product> getUsedIn() {
		return usedIn;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public void setConvertedFrom(List<UnitOfMeasureConversion> convertedFrom) {
		this.convertedFrom = convertedFrom;
	}

	public void setConvertedTo(List<UnitOfMeasureConversion> convertedTo) {
		this.convertedTo = convertedTo;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUsedIn(List<Product> usedIn) {
		this.usedIn = usedIn;
	}

}