package jdo.product.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.product.model.Good;

public class GoodRepository extends RepositoryTemplate<Good> {

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
