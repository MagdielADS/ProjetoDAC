package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tithe;
import br.edu.ifpb.dac.entities.Tither;
import br.edu.ifpb.dac.interfaces.SearchControlLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Magdiel Bruno
 */
@ManagedBean(name = "searchBean")
public class SearchBean {
    @EJB
    SearchControlLocal search;
    
    public List<Tithe> getTithes(){
        return search.getTithe();
    }
    
    public List<Tither> getTithers(){
        return search.getTithers();
    }
    
    public List<Missionary> getMissionaries(){
        return search.getMissionaries();
    }
}
