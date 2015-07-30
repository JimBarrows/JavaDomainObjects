package jdo.core.repository.specification;

public class Not<E> extends AbstractSpecification<E> {

	protected Specification<E> spec;

	public Not(Specification<E> spec) {
		this.spec = spec;
	}

	public boolean isSatisfiedBy(E entity) {
		return !spec.isSatisfiedBy(entity);
	}
}
