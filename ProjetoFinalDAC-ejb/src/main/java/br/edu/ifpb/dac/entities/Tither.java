package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Magdiel Bruno
 */
@Entity
public class Tither extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToMany
    private List<Missionary> missionary = new ArrayList<>();
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_address")
    private Address address;    

    public Tither() {
        address = new Address();
    }
    
    public void addMissionary(Missionary missionary1){
        missionary.add(missionary1);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Missionary> getMissionary() {
        return missionary;
    }

    public void setMissionary(List<Missionary> missionary) {
        this.missionary = missionary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
