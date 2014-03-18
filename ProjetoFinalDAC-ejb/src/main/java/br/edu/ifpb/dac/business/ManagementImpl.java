package br.edu.ifpb.dac.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Magdiel Bruno
 */
@Stateless
public class ManagementImpl<T> implements Management<T> {

    @PersistenceContext(name = "Scriba-PU")
    private EntityManager manager;

    public void register(T person) {
        
        manager.persist(person);
    }
}