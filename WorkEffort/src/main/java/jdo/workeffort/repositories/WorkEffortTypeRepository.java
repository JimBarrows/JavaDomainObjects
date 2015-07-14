package jdo.workeffort.repositories;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.type.WorkEffortType;

public class WorkEffortTypeRepository extends RepositoryTemplate<WorkEffortType, UUID> {

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
