package mbmp.humanresoures.model.position.salary;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import mbmp.model.BasePersistentModel;

@Entity
public class PayGrade extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private String name;
	
	private List<SalaryStep> steps;

	public String getComment() {
		return comment;
	}

	public String getName() {
		return name;
	}

	@OneToMany
	public List<SalaryStep> getSteps() {
		return steps;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSteps(List<SalaryStep> steps) {
		this.steps = steps;
	}

}
