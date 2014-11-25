package jdo.core.repository.specification;

public abstract class And<E> extends Composite<E>{

	public And(Specification<E> left, Specification<E> right) {
		super(left, right);
	}
	
	@Override
	public boolean isSatisifiedBy(E entity) {	
		return left.isSatisifiedBy(entity) && right.isSatisifiedBy(entity);
	}

}
