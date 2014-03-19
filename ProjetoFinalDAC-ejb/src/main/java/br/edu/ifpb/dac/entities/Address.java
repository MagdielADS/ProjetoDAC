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

/**
 *
 * @author Magdiel Bruno
 */
@Entity
public class Address implements Serializable{
    @Id
    @GeneratedValue(generator = "seq_address", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length=60)
    private String district;
    @Column(length=60)
    private String street;
    @Column(length=10)
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    } 
}
