package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.interfaces.Facade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Magdiel Bruno
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {
    @EJB
    Facade facade;
    
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String auth(){
       return facade.authUser(this.login, this.password);
    }
    
    public void logout(){
        facade.logout();
    }
}
