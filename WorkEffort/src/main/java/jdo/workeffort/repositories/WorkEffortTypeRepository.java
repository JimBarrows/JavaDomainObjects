package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.type.WorkEffortType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

public class WorkEffortTypeRepository extends DatabaseRepositoryTemplate<WorkEffortType, UUID> {

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
