package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.assignment.WorkEffortRoleType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Repository
public class WorkEffortRoleTypeRepository extends DatabaseRepositoryTemplate<WorkEffortRoleType, UUID> {
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
