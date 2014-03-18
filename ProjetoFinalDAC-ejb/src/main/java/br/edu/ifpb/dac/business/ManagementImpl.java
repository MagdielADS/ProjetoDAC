package br.edu.ifpb.dac.business;

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
public class ManagementImpl<T> implements Management<T> {

    @PersistenceContext(name = "Scriba-PU")
    private EntityManager manager;

    @Override
    public void register(T person) {
        manager.persist(person);
    }

    @Override
    public void update(T person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(T person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T search(T person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    
