/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Magdiel Bruno
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Person implements Serializable{
    @Id
    private Long id;
    @Column(length=60)
    private String name;
    @OneToOne
    @JoinColumn(name="id_endereco")
    private Address addres;
    
    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Address getAddres() {
        return addres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address addres) {
        this.addres = addres;
    }
}
