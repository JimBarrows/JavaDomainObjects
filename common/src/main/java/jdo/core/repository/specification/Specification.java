package jdo.core.repository.specification;

public interface Specification<E> {

	public boolean isSatisfiedBy(E entity);

	public Specification<E> and(final Specification<E> specification);

	public Specification<E> or(final Specification<E> specification);

	public Specification<E> not(final Specification<E> specification);
}
