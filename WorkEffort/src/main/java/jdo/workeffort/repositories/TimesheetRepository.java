package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.timetracking.Timesheet;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Repository
public class TimesheetRepository extends DatabaseRepositoryTemplate<Timesheet, UUID> {

	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;

	public TimesheetRepository() {
		super(Timesheet.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}
}
