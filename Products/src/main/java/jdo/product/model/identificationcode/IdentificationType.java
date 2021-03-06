package jdo.product.model.identificationcode;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

import jdo.model.BaseType;

/**
 * 
 * 
 * @author jim
 * @see Data Model Resource Book Volume 1 Figure 3.3, page 75
 */
@Entity
public class IdentificationType extends BaseType {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@OneToMany
	private List<GoodIdentification>	usedToDefine		= new ArrayList<GoodIdentification>();

	
	public List<GoodIdentification> getUsedToDefine() {
		return usedToDefine;
	}

	public void setUsedToDefine(List<GoodIdentification> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}
}
