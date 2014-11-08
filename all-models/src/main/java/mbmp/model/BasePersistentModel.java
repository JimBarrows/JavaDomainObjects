package mbmp.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


/**Every persistent model needs to have an id and version field, this just keeps me from typing it all the time.
 * Also provides basic equality and hashcode.
 * @author jimbarrows
 *
 */
@MappedSuperclass
public abstract class BasePersistentModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Long id;

	protected Long version = 0l;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public BasePersistentModel() {
		super();
	}

	public BasePersistentModel(Long id, Long version) {
		super();
		this.id = id;
		this.version = version;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal =false;
		if (obj instanceof BasePersistentModel) {
			BasePersistentModel rhs = (BasePersistentModel) obj;
			equal = new EqualsBuilder().append(this.id, rhs.id)
					.append(this.version, rhs.version).isEquals();
		} else {
			equal = false;
		}
		return equal;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(version).hashCode();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasePersistentModel [id=");
		builder.append(id);
		builder.append(", version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}
}
