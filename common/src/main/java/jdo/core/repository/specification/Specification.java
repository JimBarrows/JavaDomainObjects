package jdo.core.repository.specification;

public interface Specification<E> {

	public boolean isSatisfiedBy( E entity);
	
  	public Specification<E> and(final Specification<E> specification) {
    		return new AndSpecification<T>(this, specification);
  	}

	public Specification<E> or(final Specification<E> specification) {
    		return new OrSpecification<E>(this, specification);
  	}
  	
	public Specification<E> not(final Specification<E> specification) {
    		return new NotSpecification<E>(specification);
  	}
}
