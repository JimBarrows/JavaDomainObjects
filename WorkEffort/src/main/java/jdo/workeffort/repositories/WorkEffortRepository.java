package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.WorkEffort;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Stateful
public class WorkEffortRepository extends DatabaseRepositoryTemplate<WorkEffort, UUID> {

	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;
	
	public WorkEffortRepository() {
		super(WorkEffort.class); 
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}
		
}
