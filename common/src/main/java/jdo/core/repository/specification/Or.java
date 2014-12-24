package jdo.core.repository.specification;

public abstract class Or<E> extends Composite<E> {

	public Or(Specification<E> left, Specification<E> right) {
		super(left, right);
	}

	@Override
	public boolean isSatisifiedBy(E entity) {
		return left.isSatisifiedBy(entity) || right.isSatisifiedBy(entity);
	}
}
