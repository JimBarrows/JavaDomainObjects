package jdo.party.ui.converters;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import jdo.party.repositories.PartyRoleTypeRepository;

@FacesConverter( "PartyRoleTypeConverter")
@ManagedBean(name = "PartyRoleTypeConverter")
public class PartyRoleType implements Converter {

	@EJB
	private PartyRoleTypeRepository	partyRoleTypeRepository ;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
			return null;
		}
		long id = Long.parseLong(value);

		return partyRoleTypeRepository.findById(id);
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
