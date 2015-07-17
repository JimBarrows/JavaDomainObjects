package jdo.core.repository.specification;

public abstract class And<E> extends Composite<E>{

	public And(Specification<E> left, Specification<E> right) {
		super(left, right);
	}
	
	@Override
	public boolean isSatisfiedBy(E entity) {	
		return left.isSatisfiedBy(entity) && right.isSatisfiedBy(entity);
	}

}
