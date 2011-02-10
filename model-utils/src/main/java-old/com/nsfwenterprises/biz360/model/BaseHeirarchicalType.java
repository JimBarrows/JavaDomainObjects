package com.nsfwenterprises.biz360.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BaseHeirarchicalType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BaseHeirarchicalType parent;
	
	private List<BaseHeirarchicalType> children;

	@ManyToOne
	public BaseHeirarchicalType getParent() {
		return parent;
	}

	@OneToMany(mappedBy="parent")
	public List<BaseHeirarchicalType> getChildren() {
		return children;
	}

	public void setParent(BaseHeirarchicalType parent) {
		this.parent = parent;
	}

	public void setChildren(List<BaseHeirarchicalType> children) {
		this.children = children;
	}

}
