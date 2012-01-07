package mbms.party.services.implementation;

import java.util.Set;

import javax.ejb.Remove;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import mbmp.party.model.Party;

/**
 * Provides the 4 basic crud services, and not much else.
 * 
 * @author jimbarrows
 * 
 */
@Stateless
public class PartyCrudServices implements mbms.party.services.PartyCrudServices {

	@PersistenceContext(name="party-model")
	private EntityManager em;

//	Validator validator;
//	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

	@Override
	public Party create(Party party) /*throws ValidationException*/{

//		validator = factory.getValidator();
//		Set<ConstraintViolation<Party>> violations = validator.validate(party);
//		if (violations.isEmpty()) {
			em.persist(party);
//		} else {
//			throw new ValidationException();
//		}
//
		return party;
	}

	@Override
	public Party read(Long id) {
		return em.find(Party.class, id);
	}

	@Override
	public Party update(Party party) throws ValidationException{
//		validator = factory.getValidator();
//		Set<ConstraintViolation<Party>> violations = validator.validate(party);
//		if (violations.isEmpty()) {
			return em.merge(party);
//		}
//		return party;
	}

	@Remove
	@Override
	public void delete(Party party) {
		em.remove(party);

	}

	public PartyCrudServices() {
		super();
	}

	public PartyCrudServices(EntityManager em) {
		super();
		this.em = em;
	}
}
