/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.business;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tither;
import br.edu.ifpb.dac.interfaces.Management;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Magdiel Bruno
 */
@Stateless
@Remote(Management.class)
public class ManagementImpl implements Management{
    @PersistenceContext(name="Scriba-PU")
    private EntityManager manage;
    

    @Override
    public void registerTither(Tither tither) {
        manage.persist(tither);
    }

    @Override
    public void updateTither(Tither tither) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTither(Tither tither) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tither searchTither(Tither tither) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerMissionary(Missionary missionary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMissionary(Missionary missionary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeMissionary(Missionary missionary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Missionary searchMissionary(Missionary missionary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
