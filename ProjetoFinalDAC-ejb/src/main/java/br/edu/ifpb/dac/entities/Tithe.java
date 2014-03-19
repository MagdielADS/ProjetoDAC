package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Id
    private long book; 
    @Column(precision = 2, scale = 10)
    private double amount;
    @Temporal(TemporalType.DATE)
    private Calendar dateOfReceipt;
    @ManyToOne
    private Tither tither;

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
}
