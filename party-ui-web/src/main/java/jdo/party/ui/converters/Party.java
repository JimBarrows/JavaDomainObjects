package jdo.party.ui.converters;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import jdo.party.services.PartyCrudServices;

@ManagedBean(name="PartyConverter")
public class Party implements Converter{

	 @EJB
     private PartyCrudServices partyCrudServices;
     
     @Override
     public Object getAsObject(FacesContext context, UIComponent component, String value) {
             if (value == null) {
                     return null;
             }
             long id = Integer.parseInt(value);
             
             return partyCrudServices.read(id);
     }

     @Override
     public String getAsString(FacesContext context, UIComponent component, Object value) {
             if (value == null) {
                     return null;
             }
             Long id = ((jdo.party.model.Party) value).getId();
             
             return (id != null) ? id.toString() : null;
     }
}
