package jdo.product.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.product.model.Service;

public class ServiceRepository extends RepositoryTemplate<Service> {

	@PersistenceContext(name = "JdoProducts")
	protected EntityManager entityManager;

	public ServiceRepository() {
		super(Service.class);
	}

	@Override
	protected EntityManager entityManager() {
		return entityManager;
	}

}
