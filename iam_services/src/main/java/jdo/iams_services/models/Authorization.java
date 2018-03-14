package jdo.iams_services.models;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Entity
public class Authorization extends PersistentEntity {
	private String authorization;
	private DateTimeRange activeTimeRange;

	public Authorization() {
		authorization="";
		activeTimeRange = new DateTimeRange();
	}

	public Authorization(String authorization) {
		assert isNotEmpty(authorization) : "authorization cannot be empty";
		this.authorization = authorization;
		activeTimeRange = new DateTimeRange();
	}

	@NotEmpty
	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	@NotNull
	public DateTimeRange getActiveTimeRange() {
		return activeTimeRange;
	}

	public void setActiveTimeRange(DateTimeRange activeTimeRange) {
		this.activeTimeRange = activeTimeRange;
	}

	@Transient
	public boolean isActive() {
		return activeTimeRange.isActive();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("authorization", authorization)
				.append("activeTimeRange", activeTimeRange)
				.toString();
	}
}
