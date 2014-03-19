package br.edu.ifpb.dac.business;

import br.edu.ifpb.dac.entities.Administrator;
import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tither;
import br.edu.ifpb.dac.interfaces.Management;
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

    @Override
    public Missionary searchMissionaryForId(Long id) {
        return manager.find(Missionary.class, id);
    }

    @Override
    public Tither searchTitherForId(Long id) {
        return manager.find(Tither.class, id);
    }
    
}