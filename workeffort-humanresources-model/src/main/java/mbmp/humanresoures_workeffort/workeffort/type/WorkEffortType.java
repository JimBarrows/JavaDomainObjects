package mbmp.humanresoures_workeffort.workeffort.type;

import java.util.List;

import javax.persistence.OneToMany;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 10:17:04 AM
 */
public class WorkEffortType extends mbmp.workeffort.type.WorkEffortType{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<WorkEffortSkill> skillNeeds;

    @OneToMany
    public List<WorkEffortSkill> getSkillNeeds() {
        return skillNeeds;
    }
    
    public void setSkillNeeds(List<WorkEffortSkill> skillNeeds) {
        this.skillNeeds = skillNeeds;
    }



}
