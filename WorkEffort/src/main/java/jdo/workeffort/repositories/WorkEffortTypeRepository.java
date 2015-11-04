package jdo.workeffort.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.type.WorkEffortType;

public class WorkEffortTypeRepository extends RepositoryTemplate<WorkEffortType> {

	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;

	public WorkEffortTypeRepository() {
		super(WorkEffortType.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}
}
