package jdo.workeffort.repositories;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.WorkEffort;


public class WorkEffortRepository extends RepositoryTemplate<WorkEffort, UUID> {

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
