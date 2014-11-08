package mbmp.product.model.identificationCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
 

import mbmp.model.BasePersistentModel;
import mbmp.product.model.Good;

/**
 * 
 * @author Jim.Barrows
 *@see Data Model Resource Book Volume 1 Figure 3.3, page 75
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class GoodIdentification extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IdentificationType definedAs;

	private Good identifierFor;

	private String idValue;

	@ManyToOne
	public IdentificationType getDefinedAs() {
		return definedAs;
	}

	@ManyToOne
	public Good getIdentifierFor() {
		return identifierFor;
	}

	@NotNull
	@Column(nullable = false, unique = true)
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
