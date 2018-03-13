package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.timetracking.Timesheet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

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
