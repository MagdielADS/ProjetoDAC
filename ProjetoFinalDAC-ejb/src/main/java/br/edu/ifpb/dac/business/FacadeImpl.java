package br.edu.ifpb.dac.business;

import br.edu.ifpb.dac.entities.Administrator;
import br.edu.ifpb.dac.entities.Tithe;
import br.edu.ifpb.dac.interfaces.Facade;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Magdiel Bruno
 */
@Stateful
@Local(Facade.class)
public class FacadeImpl implements Facade{

    @PersistenceContext(unitName = "Scriba-PU")
    private EntityManager manager;
    
    @EJB
    private UserLoggedCounter counter;
    
    private Administrator userLogged;
    
    public Administrator getUserLogged() {
        return userLogged;
    }
    
    public void setUserLogged(Administrator userLogged) {
        this.userLogged = userLogged;
    }
    
    public String authUser(String login, String password) {
        try {
            Query query = manager.createQuery("select a from Administrator a where a.login = :login and a.password = :password");
            query.setParameter("login", login);
            query.setParameter("password", password);
            this.userLogged = (Administrator) query.getSingleResult();
            counter.addUser();
            return "/faces/menu.xhtml";
        } catch (Exception e) {
            return "erro";
        }
    }
    
    public void launchTithing(Tithe tithe) {
        manager.persist(tithe);
    }
    
    @Remove
    public String logout() {
        counter.deductUser();
        return "/index.xhtml";
    }
}
