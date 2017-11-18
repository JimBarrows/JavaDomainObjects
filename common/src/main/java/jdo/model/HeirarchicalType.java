package jdo.model;

import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Some types might need children, and all children are considered to be the same type as the parent.
 * 
 * @author jimbarrows
 */
@MappedSuperclass
public class HeirarchicalType extends Type {

	@ManyToOne
	private HeirarchicalType parent;

	@OneToMany(mappedBy = "parent")
	private List<HeirarchicalType> children = new ArrayList<HeirarchicalType>();

	public HeirarchicalType() {
		super();
	}

	public HeirarchicalType(UUID id, Long version, String description) {
		super(id, version, description);
	}

	public HeirarchicalType(UUID id, Long version, String description, HeirarchicalType parent, List<HeirarchicalType> children) {
		super(id, version, description);
		this.parent = parent;
		this.children = children;
	}

	/**
	 * Two heirarchies should only be the same if they are the same type. Base classes should provide a public version, the ensures the same type.
	 * 
	 * @param right
	 * @return
	 */
	public boolean isA(HeirarchicalType right) {
		if (parent == null && right.getParent() == null) {
			return true;
		} else {
			return new EqualsBuilder().append(parent, right.parent).isEquals() && ((parent != null) && parent.isA(right.getParent()));
		}
	}

	public HeirarchicalType getParent() {
		return parent;
	}

	public List<HeirarchicalType> getChildren() {
		return children;
	}

	public void setChildren(List<HeirarchicalType> children) {
		this.children = children;
	}

	public void addChild(HeirarchicalType child) {
		child.setParent(this);
		children.add(child);

	}

	private static final long serialVersionUID = 1L;

	public void setParent(HeirarchicalType parent) {
		this.parent = parent;
	}

}
