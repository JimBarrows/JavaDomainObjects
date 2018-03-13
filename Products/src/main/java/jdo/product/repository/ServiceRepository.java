package jdo.product.repository;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.product.model.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

public class ServiceRepository extends DatabaseRepositoryTemplate<Service, UUID> {

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
