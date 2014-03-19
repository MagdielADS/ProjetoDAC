package br.edu.ifpb.dac.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Magdiel Bruno
 */
@Entity
public class Missionary extends Person implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_missionary", strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_address")
    private Address address;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Phone> phones = new ArrayList<>();;

    public Missionary() {
        address = new Address();
    }

    public void addPhone(Phone phone){
        phones.add(phone);
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
