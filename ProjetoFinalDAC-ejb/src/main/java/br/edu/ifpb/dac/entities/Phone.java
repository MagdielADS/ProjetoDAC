package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author filipe
 */
@Entity
public class Phone implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_phone", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 5)
    private String ddd;
    @Column(length = 20)
    private String numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
