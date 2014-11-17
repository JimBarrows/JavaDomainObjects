package jdo.party.ui.converters;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import jdo.party.services.PartyRoleTypeCrudServices;

@ManagedBean(name = "PartyRoleTypeConverter")
public class PartyRoleType implements Converter {

	@EJB
	private PartyRoleTypeCrudServices	crudServices;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
			return null;
		}
		long id = Long.parseLong(value);

		return crudServices.read(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}
		Long id = ((jdo.party.model.PartyRoleType) value).getId();

		return (id != null) ? id.toString() : null;
	}
}
