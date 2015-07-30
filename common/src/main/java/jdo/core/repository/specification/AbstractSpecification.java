package jdo.core.repository.specification;

public abstract class AbstractSpecification<E> implements Specification<E> {

	public Specification<E> and(final Specification<E> specification) {
		return new And<E>(this, specification);
	}

	public Specification<E> or(final Specification<E> specification) {
		return new Or<E>(this, specification);
	}

	public Specification<E> not(final Specification<E> specification) {
		return new Not<E>(specification);
	}
}
