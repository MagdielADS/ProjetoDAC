/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Magdiel Bruno
 */
@Entity
@DiscriminatorValue("D")
public class Tither extends Person implements Serializable{
   @ManyToMany
   private Set<Missionary> missionary;
}
