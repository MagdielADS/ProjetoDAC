/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Magdiel Bruno
 */
public class TithePK implements Serializable{
    private long id;
    private long book;

    public long getBook() {
        return book;
    }

    public Long getId() {
        return id;
    }

    public void setBook(long book) {
        this.book = book;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    
}
