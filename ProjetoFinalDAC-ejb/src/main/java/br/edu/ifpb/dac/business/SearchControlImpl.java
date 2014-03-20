package br.edu.ifpb.dac.business;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tithe;
import br.edu.ifpb.dac.entities.Tither;
import br.edu.ifpb.dac.interfaces.SearchControl;
import br.edu.ifpb.dac.interfaces.SearchControlLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
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
@Local(SearchControlLocal.class)
@Remote(SearchControl.class)
public class SearchControlImpl implements SearchControl, SearchControlLocal {

    @PersistenceContext(name = "Scriba-PU")
    private EntityManager manager;

    @Override
    public String searchNameMissionaryById(long id) {
        try {
            Query query = manager.createQuery("select m.name from Missionary m where m.id=:id");
            query.setParameter("id", id);
            return (String) query.getSingleResult();
        } catch (Exception e) {
            return "Missionário não encontrado";
        }
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
        try {
            Query query = manager.createQuery("select t.name from Tither t where t.id=:id");
            query.setParameter("id", id);
            return (String) query.getSingleResult();
        } catch (Exception e) {
            return "Dizimista não encontrado";
        }
    }

    @Override
    public String searchDistrictMissionary(String name) {
        try {
            Query query = manager.createQuery("select m.address.district from Missionary m where m.cpf=:cpf");
            query.setParameter("cpf", name);
            return (String) query.getSingleResult();
        } catch (Exception e) {
            return "Bairro não encontrado ou missionário não cadastrado";
        }
    }

    @Override
    public List<Tither> getTithers() {
        List<Tither> tithers = new ArrayList<>();
        Query query = manager.createQuery("select t from Tither t");
        tithers = query.getResultList();
        return tithers;
    }

    @Override
    public List<Missionary> getMissionaries() {
        List<Missionary> missionaries = new ArrayList<>();
        Query query = manager.createQuery("select m from Missionary m");
        missionaries = query.getResultList();
        return missionaries;
    }

    @Override
    public List<Tithe> getTithe() {
        List<Tithe> tithes = new ArrayList<>();
        Query query = manager.createQuery("select t from Tithe t");
        tithes = query.getResultList();
        return tithes;
    }
}
