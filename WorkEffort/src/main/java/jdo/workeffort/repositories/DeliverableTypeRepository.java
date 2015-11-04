package jdo.workeffort.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.requirement.DeliverableType;

public class DeliverableTypeRepository extends RepositoryTemplate<DeliverableType> {

	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;

	public DeliverableTypeRepository() {
		super(DeliverableType.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}

}
