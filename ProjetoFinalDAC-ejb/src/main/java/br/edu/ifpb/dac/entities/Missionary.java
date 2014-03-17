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

/**
 *
 * @author Magdiel Bruno
 */
@Entity
@DiscriminatorValue("M")
public class Missionary extends Person implements Serializable{
    @Column(length=20)
    private String contact;
}
