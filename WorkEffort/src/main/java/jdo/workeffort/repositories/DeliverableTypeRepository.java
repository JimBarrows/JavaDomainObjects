package jdo.workeffort.repositories;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.workeffort.model.requirement.DeliverableType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Repository
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
