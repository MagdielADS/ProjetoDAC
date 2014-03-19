package br.edu.ifpb.dac.business;

import br.edu.ifpb.dac.interfaces.SearchControl;
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
public class SearchControlImpl implements SearchControl {

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
}
