package jdo.iams_services.repositories.implementations;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.iams_services.models.Identity;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.UUID;

@Stateful
public class IdentityRepository extends DatabaseRepositoryTemplate<Identity, UUID> implements jdo.iams_services.repositories.IdentityRepository {

	@PersistenceContext(name = "IamServices", type = PersistenceContextType.EXTENDED)
	protected EntityManager em;

	/**
	 * Constructor needs the type, because of type erasure. Stupid Java
	 */
	public IdentityRepository() {
		super(Identity.class);
	}

	/**
	 * The entity manager used by JPA to access the database.
	 *
	 * @return the entity manager.
	 */
	@Override
	protected EntityManager entityManager() {
		return em;
	}
}
