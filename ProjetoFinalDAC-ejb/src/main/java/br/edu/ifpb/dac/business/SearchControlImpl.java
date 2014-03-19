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
    public String searchNameMissionaryById(long id) {
        Query query = manager.createQuery("select m.name from Missionary m where m.id=:id");
        query.setParameter("id", id);
        return (String) query.getSingleResult();
    }

    @Override
    public long searchQtdeMissionary() {
        Query query = manager.createQuery("select count(m) from Missionary m");
        return (long) query.getSingleResult();
    }

    @Override
    public long searchQtdeTither() {
        Query query = manager.createQuery("select count(t) from Tither t");
        return (long) query.getSingleResult();
    }

    @Override
    public String searchNameTitherById(long id) {
        Query query = manager.createQuery("select t.name from Tither t where t.id=:id");
        query.setParameter("id", id);
        return (String) query.getSingleResult();
    }

    @Override
    public String searchDistrictMissionary(String name) {
        Query query = manager.createQuery("select m.address.district from Missionary m where m.name=:name");
        query.setParameter("name", name);
        return (String) query.getSingleResult();
    }
}
