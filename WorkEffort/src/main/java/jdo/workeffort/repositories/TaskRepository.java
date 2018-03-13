package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.Task;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

public class TaskRepository extends DatabaseRepositoryTemplate<Task, UUID> {

	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;
	
	public TaskRepository() {
		super(Task.class); 
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}

}
