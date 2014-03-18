package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Magdiel Bruno
 */
@MappedSuperclass
@Inheritance(strategy= InheritanceType.JOINED)
public class Person implements Serializable{
    
    @Column(length=14, unique=true)
    private String cpf;
    @Column(length=80, nullable = false)
    private String name;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
