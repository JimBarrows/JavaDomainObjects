package jdo.product.repository;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.product.model.Good;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

public class GoodRepository extends DatabaseRepositoryTemplate<Good, UUID> {

	@PersistenceContext(name = "JdoProducts")
	protected EntityManager entityManager;
	
	public GoodRepository() {
		super(Good.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}

}
