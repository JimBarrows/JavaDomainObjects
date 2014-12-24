package jdo.core.repository.specification;

public interface Specification<E> {

	public boolean isSatisifiedBy( E entity);
}
