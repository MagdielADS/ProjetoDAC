package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.interfaces.Management;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author filipe
 */
@FacesConverter(value = "missionaryConverter")
public class MissionaryConverter implements Converter{
    
    Management<Missionary> management;

    public MissionaryConverter() {
    }

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return management.searchMissionaryForId(Long.parseLong(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Missionary missionary = (Missionary) o;
        return missionary.getId().toString();
    }
    
    
    
    
}
