package jdo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Some types might need children, and all children are considered to be the
 * same type as the parent.
 * 
 * @author jimbarrows
 * 
 */
@Entity
public class BaseHeirarchicalType extends BaseType {

	private BaseHeirarchicalType		parent;

	private List<BaseHeirarchicalType>	children	= new ArrayList<BaseHeirarchicalType>();

	public BaseHeirarchicalType() {
		super();
	}

	public BaseHeirarchicalType(Long id, Long version, String description) {
		super(id, version, description);
	}

	public BaseHeirarchicalType(Long id, Long version, String description, BaseHeirarchicalType parent, List<BaseHeirarchicalType> children) {
		super(id, version, description);
		this.parent = parent;
		this.children = children;
	}

	/**
	 * Two heirarchies should only be the same if they are the same type. Base
	 * classes should provide a public version, the ensures the same type.
	 * 
	 * @param right
	 * @return
	 */
	public boolean isA(BaseHeirarchicalType right) {
		if (parent == null && right.getParent() == null) {
			return true;
		} else {
			return new EqualsBuilder().append(parent, right.parent).isEquals() && ((parent == null) ? false : parent.isA(right.getParent()));
		}
	}

	@ManyToOne
	public BaseHeirarchicalType getParent() {
		return parent;
	}

	@OneToMany(mappedBy = "parent")
	public List<BaseHeirarchicalType> getChildren() {
		return children;
	}

	public void setParent(BaseHeirarchicalType parent) {
		this.parent = parent;
	}

	public void setChildren(List<BaseHeirarchicalType> children) {
		this.children = children;
	}

	private static final long	serialVersionUID	= 1L;

	public void addChild(BaseHeirarchicalType child) {
		child.setParent(this);
		children.add(child);

	}

}
