package jdo.party.ui.converters;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import jdo.party.model.Party;
import jdo.party.repositories.PartyRepository;

@ManagedBean(name="OrganizationConverter")
public class Organization implements Converter{

	 @EJB
	 private PartyRepository partyRepository;
     
     @Override
     public Object getAsObject(FacesContext context, UIComponent component, String value) {
             if (value == null) {
                     return null;
             }
             long id = Integer.parseInt(value);
             
             return partyRepository.findById(id);
     }

     @Override
     public String getAsString(FacesContext context, UIComponent component, Object value) {
             if (value == null) {
                     return null;
             }
             Long id = ((Party) value).getId();
             
             return (id != null) ? id.toString() : null;
     }
}
