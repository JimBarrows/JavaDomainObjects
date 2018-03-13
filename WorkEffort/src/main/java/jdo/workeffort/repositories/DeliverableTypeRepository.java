package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.requirement.DeliverableType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

public class DeliverableTypeRepository extends DatabaseRepositoryTemplate<DeliverableType, UUID> {

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
