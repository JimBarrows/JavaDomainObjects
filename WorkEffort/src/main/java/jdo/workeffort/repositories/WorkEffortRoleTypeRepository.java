package jdo.workeffort.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.assignment.WorkEffortRoleType;

public class WorkEffortRoleTypeRepository extends RepositoryTemplate<WorkEffortRoleType> {
	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;

	public WorkEffortRoleTypeRepository() {
		super(WorkEffortRoleType.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}
}
