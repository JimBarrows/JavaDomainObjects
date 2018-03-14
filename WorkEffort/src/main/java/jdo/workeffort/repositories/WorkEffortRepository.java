package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.WorkEffort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Repository
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
