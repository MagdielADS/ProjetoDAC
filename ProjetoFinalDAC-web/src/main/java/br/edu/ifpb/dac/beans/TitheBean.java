/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.entities.Tithe;
import br.edu.ifpb.dac.entities.Tither;
import br.edu.ifpb.dac.interfaces.Facade;
import br.edu.ifpb.dac.interfaces.Management;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author Magdiel Bruno
 */
@Named(value = "titheBean")
public class TitheBean {
    private Tithe tithe;
    private long id;
    
    @EJB
    Management<Tithe> man;
    
    @EJB
    Facade facade;
    /**
     * Creates a new instance of TitheBean
     */
    public TitheBean() {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void launch(){
        tithe.setTither(man.searchTitherForId(this.id));
        facade.launchTithing(this.tithe);
    }
}
