package jdo.iams_services.models;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class Authorization extends BasePersistentModel{
	private String authorization;
	private DateTimeRange activeTimeRange;

	public Authorization() {
		authorization="";
		activeTimeRange = new DateTimeRange();
	}

	public Authorization(String authorization) {
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
}
