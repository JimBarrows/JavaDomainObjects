package jdo.workeffort.repositories;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.workeffort.model.requirement.DeliverableType;

public class DeliverableTypeRepository extends RepositoryTemplate<DeliverableType, UUID> {

	public DeliverableTypeRepository() {
		super(DeliverableType.class);
	}

	@PersistenceContext(name = "WorkEffort")
	protected EntityManager entityManager;

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}

}
