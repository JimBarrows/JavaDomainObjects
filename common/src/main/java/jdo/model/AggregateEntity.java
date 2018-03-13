package jdo.model;

import java.util.UUID;

/**
 * A synthetic entity is an entity who does not have a real representation in storage, and is made of 1 or more entities.
 */
public abstract class AggregateEntity<E extends Entity> implements Entity {

	public UUID getId() {
		return rootAggregate().getId();
	}

	public abstract E rootAggregate();
}
