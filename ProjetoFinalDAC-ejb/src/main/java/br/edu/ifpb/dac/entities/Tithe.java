/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Magdiel Bruno
 */
@Entity
@IdClass(TithePK.class)
public class Tithe implements Serializable{
    @Id
    private long id;
    @Id
    private long book; 
    private double amount;
    @Temporal(TemporalType.DATE)
    private Calendar dateOfReceipt;
    @ManyToOne
    private Tither tither;
    @ManyToOne
    private Administrator user;

    public Long getId() {
        return id;
    }

    public long getBook() {
        return book;
    }

    public double getValue() {
        return amount;
    }

    public Calendar getDate() {
        return dateOfReceipt;
    }

    public Tither getTither() {
        return tither;
    }

    public Administrator getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBook(long book) {
        this.book = book;
    }

    public void setValue(double value) {
        this.amount = value;
    }

    public void setDate(Calendar date) {
        this.dateOfReceipt = date;
    }

    public void setTither(Tither tither) {
        this.tither = tither;
    }

    public void setUser(Administrator user) {
        this.user = user;
    }
    
    
}
