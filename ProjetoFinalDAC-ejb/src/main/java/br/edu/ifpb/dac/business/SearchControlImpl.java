package br.edu.ifpb.dac.business;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tither;
import br.edu.ifpb.dac.interfaces.SearchControl;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author filipe
 */
@Stateless
@Remote(SearchControl.class)
public class SearchControlImpl implements SearchControl{
    @PersistenceContext(name = "Scriba-PU")
    private EntityManager manager;
    
    
    @Override
    public List<Tither> getTithers() {
        Query query = manager.createQuery("select t from Tither t");
        List<Tither> tithers = query.getResultList();
        return tithers;
    }

    @Override
    public List<Missionary> getMissionaries() {
        Query query = manager.createQuery("select m from Missionary m");
        List<Missionary> missionaries = query.getResultList();
        return missionaries;
    }

    @Override
    public Tither getTitherById(long id) {
        Query query = manager.createNamedQuery("Tither.findById");
        query.setParameter("id", id);
        return (Tither) query.getSingleResult();
        
//        Tither tither = (Tither) manager.createNamedQuery("Tither.findById")
//                .setParameter("id", id)
//                .getSingleResult();
//        return tither;
    }
}
