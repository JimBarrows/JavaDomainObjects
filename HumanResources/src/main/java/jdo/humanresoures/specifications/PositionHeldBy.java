package jdo.humanresoures.specifications;

import jdo.core.repository.specification.AbstractSpecification;
import jdo.humanresoures.model.position.Position;

import java.util.UUID;

/**
 * A person, identified by their UUID has a position if a position is filled by them, and the fulfillment is active.
 */
public class PositionHeldBy extends AbstractSpecification<Position> {

	private UUID person;

	public PositionHeldBy(UUID person) {
		this.person = person;
	}

	@Override
	public boolean isSatisfiedBy(Position entity) {
		return entity.getFilledBy().stream().anyMatch(positionFulfillment -> positionFulfillment.getAcceptedBy().equals(person) && positionFulfillment.getDateTimeRange().isActive());
	}

	public static final PositionHeldBy positionHeldBy(UUID person) {
		return new PositionHeldBy(person);
	}
}
