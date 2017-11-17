package jdo.humanresoures.repository.implementations;

import jdo.core.repository.RepositoryTemplate;
import jdo.humanresoures.model.position.Position;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.UUID;

@Stateful
public class PositionRepository extends RepositoryTemplate<Position, UUID> implements jdo.humanresoures.repository.PositionRepository{
	@PersistenceContext(name = "HumanResources", type= PersistenceContextType.EXTENDED)
	protected EntityManager em;

	public PositionRepository() {
		super(Position.class);
	}

	@Override
	protected EntityManager entityManager() {
		return em;
	}
}
