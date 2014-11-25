package jdo.core.repository;

import java.util.List;

import jdo.core.repository.specification.Specification;

public interface Repository<E,I> {

	public E create( E entity);
	public E findById( I id);
	public List<E> findBy( Specification<E> specification);
	public List<E> findAll();
	public E update( E entity);
	public void delete( E entity);
}
