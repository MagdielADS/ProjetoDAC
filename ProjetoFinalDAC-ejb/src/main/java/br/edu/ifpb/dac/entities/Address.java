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

/**
 *
 * @author Magdiel Bruno
 */
@Entity
public class Address implements Serializable{
    @Id
    private Long ID;
    @Column(length=60)
    private String district;
    @Column(length=60)
    private String street;
    private long number;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDistrict() {
        return district;
    }

    public long getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    } 
}
