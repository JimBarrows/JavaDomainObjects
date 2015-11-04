package jdo.workeffort.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.WorkEffortStatusType;

public class WorkEffortStatusTypeRepository extends RepositoryTemplate<WorkEffortStatusType> {
	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;

	public WorkEffortStatusTypeRepository() {
		super(WorkEffortStatusType.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}
}
