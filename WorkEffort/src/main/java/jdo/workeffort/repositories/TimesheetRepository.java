package jdo.workeffort.repositories;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.timetracking.Timesheet;

public class TimesheetRepository extends RepositoryTemplate<Timesheet, UUID> {

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
