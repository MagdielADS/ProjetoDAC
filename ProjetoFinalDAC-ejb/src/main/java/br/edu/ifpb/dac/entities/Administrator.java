/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Magdiel Bruno
 */
@Entity
@DiscriminatorValue("A")
public class Administrator extends Person implements Serializable{
    @Column(length=20)
    private String login;
    @Column(length=10)
    private String password;

    public String getLogin() {
        return login;
    }
   
    public String getPassword() {
        return password;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
}
