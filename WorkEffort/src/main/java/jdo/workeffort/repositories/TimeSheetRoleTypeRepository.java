package jdo.workeffort.repositories;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.timetracking.TimeSheetRoleType;

public class TimeSheetRoleTypeRepository extends RepositoryTemplate<TimeSheetRoleType, UUID> {
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
