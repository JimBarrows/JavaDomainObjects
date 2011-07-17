package mbmp.humanresoures.model.position;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import mbmp.model.BaseType;

@Entity
public class ResponsibilityType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ValidResponsibility> usedToDefine;

	@OneToMany
	public List<ValidResponsibility> getUsedToDefine() {
		return usedToDefine;
	}

	public void setUsedToDefine(List<ValidResponsibility> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}
	

}
