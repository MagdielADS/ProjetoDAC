package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.entities.Tithe;
import br.edu.ifpb.dac.interfaces.Facade;
import br.edu.ifpb.dac.interfaces.Management;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Magdiel Bruno
 */
@ManagedBean(name = "titheBean")
public class TitheBean {
    private Tithe tithe = new Tithe();
    private Long id;
    
    @EJB
    Management<Tithe> man;
    
    @EJB
    Facade facade;
    
    public void launch() {
        tithe.setDate();
        tithe.setTither(man.searchTitherForId(this.id));
        facade.launchTithing(this.tithe);
    }    
    
    public long getBook(){
        return tithe.getBook();
    }
    
    public void setBook(long book){
        tithe.setBook(book);
    }
    
    public double getValue(){
        return tithe.getValue();
    }
    
    public void setValue(double value){
        tithe.setValue(value);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
