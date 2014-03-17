/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.business;

import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author Magdiel Bruno
 */
@Singleton
@Startup
public class UserLoggedCounter {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void addUser(){
        this.counter++;
    }
    
    public void deductUser(){
        this.counter--;
    }
}
