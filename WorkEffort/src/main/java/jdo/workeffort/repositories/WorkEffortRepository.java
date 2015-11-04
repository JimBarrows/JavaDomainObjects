package jdo.workeffort.repositories;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.WorkEffort;

@Stateful
public class WorkEffortRepository extends RepositoryTemplate<WorkEffort> {

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
