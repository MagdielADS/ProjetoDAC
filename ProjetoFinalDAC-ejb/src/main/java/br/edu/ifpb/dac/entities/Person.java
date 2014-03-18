/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length=14, unique=true)
    private String cpf;
    @Column(length=80, nullable = false)
    private String name;
    @OneToOne
    @JoinColumn(name="id_address")
<<<<<<< HEAD
    private Address address;
=======
    private Address addres;
>>>>>>> 5e9773d26ed7736f71a62cc034cd01a02cfe3a6b
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getName() {
        return name;
    }

    public Address getAddres() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address addres) {
        this.address = addres;
    }
}
