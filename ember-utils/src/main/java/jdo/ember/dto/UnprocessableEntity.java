package jdo.ember.dto;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

public final class UnprocessableEntity implements Response.StatusType {

	@Override
	public int getStatusCode() {

		return 422;
	}

	@Override
	public Family getFamily() {
		return Family.CLIENT_ERROR;
	}

	@Override
	public String getReasonPhrase() {
		return "Unprocessable Entity";
	}

}
