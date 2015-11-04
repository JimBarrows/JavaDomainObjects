package jdo.workeffort.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.Task;

public class TaskRepository extends RepositoryTemplate<Task> {

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
