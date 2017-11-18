package jdo.humanresoures.model.position;

import jdo.model.Type;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ResponsibilityType extends Type {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	@OneToMany
	private List<ValidResponsibility>	usedToDefine;

	public List<ValidResponsibility> getUsedToDefine() {
		return usedToDefine;
	}

	public void setUsedToDefine(List<ValidResponsibility> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}

}
