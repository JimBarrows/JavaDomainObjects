package jdo.core.repository.specification;

public class Or<E> extends Composite<E> {

	public Or(Specification<E> left, Specification<E> right) {
		super(left, right);
	}

	@Override
	public boolean isSatisfiedBy(E entity) {
		return left.isSatisfiedBy(entity) || right.isSatisfiedBy(entity);
	}
}
