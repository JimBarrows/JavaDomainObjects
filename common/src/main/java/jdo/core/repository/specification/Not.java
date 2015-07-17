package jdo.core.repository.specification;

public abstract class Not<E> implements Specification<E>{

	protected Specification<E> spec;
	
	public Not( Specification<E> spec) {
		this.spec = spec;
	}
	public boolean isSatisfiedBy( E entity) {
		return ! spec.isSatisfiedBy(entity);
	}
}
