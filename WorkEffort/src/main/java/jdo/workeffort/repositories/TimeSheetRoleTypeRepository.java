package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.timetracking.TimeSheetRoleType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

public class TimeSheetRoleTypeRepository extends DatabaseRepositoryTemplate<TimeSheetRoleType, UUID> {
	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;

	public TimeSheetRoleTypeRepository() {
		super(TimeSheetRoleType.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}
}
