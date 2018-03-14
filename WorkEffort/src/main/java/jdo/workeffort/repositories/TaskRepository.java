package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.Task;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Repository
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
