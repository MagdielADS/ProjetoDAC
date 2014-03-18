/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.business;

import br.edu.ifpb.dac.entities.Administrator;
import br.edu.ifpb.dac.entities.Tithe;
import javax.ejb.EJB;
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
public class Facade {

    @PersistenceContext(name = "Scriba-PU")
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
    
    public boolean authUser(String login, String password) {
        try {
            Query query = manager.createQuery("select a from Administrator a where a.login = :login and a.password = :password");
            query.setParameter("login", login);
            query.setParameter("password", password);
            this.userLogged = (Administrator) query.getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void launchTithing(Tithe tithe) {
        manager.persist(tithe);
    }
    
    @Remove
    public void logout() {
        counter.deductUser();
    }
}
