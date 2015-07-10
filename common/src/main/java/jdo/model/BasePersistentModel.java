package jdo.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Every persistent model needs to have an id and version field, this just keeps
 * me from typing it all the time. Also provides basic equality and hashcode.
 * 
 * @author jimbarrows
 *
 */
@MappedSuperclass
public class BasePersistentModel implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID				id;

	@Version
	private Long				version				= 0l;

	public UUID getId() {
		return id;
	}

	public BasePersistentModel() {
		super();
	}

	public BasePersistentModel(UUID id, Long version) {
		super();
		this.id = id;
		this.version = version;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasePersistentModel other = (BasePersistentModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
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
