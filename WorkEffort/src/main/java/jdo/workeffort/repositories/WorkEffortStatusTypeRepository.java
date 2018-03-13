package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.WorkEffortStatusType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

public class WorkEffortStatusTypeRepository extends DatabaseRepositoryTemplate<WorkEffortStatusType, UUID> {
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
