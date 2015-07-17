package jdo.core.repository.specification;

public interface Specification<E> {

	public boolean isSatisfiedBy( E entity);
}
