package jdo.product.model.identificationcode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import jdo.model.BasePersistentModel;
import jdo.product.model.Good;

/**
 * 
 * @author Jim.Barrows
 * @see Data Model Resource Book Volume 1 Figure 3.3, page 75
 */
@Entity
public class GoodIdentification extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private IdentificationType	definedAs;

	@ManyToOne
	private Good				identifierFor;

	@NotNull
	@Column(nullable = false, unique = true)
	private String				idValue;

	
	public IdentificationType getDefinedAs() {
		return definedAs;
	}

	
	public Good getIdentifierFor() {
		return identifierFor;
	}

	
	public String getIdValue() {
		return idValue;
	}

	public void setDefinedAs(IdentificationType definedAs) {
		this.definedAs = definedAs;
	}

	public void setIdentifierFor(Good identifierFor) {
		this.identifierFor = identifierFor;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
}
